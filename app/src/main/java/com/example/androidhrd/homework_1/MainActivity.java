package com.example.androidhrd.homework_1;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidhrd.homework_1.model.Register;

public class MainActivity extends AppCompatActivity {

    Register test = new Register();
    EditText tfname, tfphone, tfclass;
    Button register , call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tfphone = findViewById(R.id.tf_phone);
        tfname = findViewById(R.id.tf_name);
        tfclass = findViewById(R.id.tf_class);



        register = (Button) findViewById(R.id.register);
        call = (Button) findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + tfphone.getText().toString()  ));
                startActivityForResult(intent,5);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.setName(tfname.getText().toString());
                test.setPhone(tfphone.getText().toString());
                test.setClassname(tfclass.getText().toString());

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Register",test);
                startActivityForResult(intent,5);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 5 && resultCode == 5){
            Register  rg = (Register) data.getSerializableExtra("Stu_Register");

            tfname.setText(rg.getName().toString());
            tfphone.setText(rg.getPhone().toString());
            tfclass.setText(rg.getClassname().toString());
        }
    }

}
