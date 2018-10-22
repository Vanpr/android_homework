package com.example.androidhrd.homework_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidhrd.homework_1.model.Register;

public class Main2Activity extends AppCompatActivity {
    TextView t_name , t_phone , t_class;
    Button btBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t_name = findViewById(R.id.name2);
        t_phone = findViewById(R.id.phone2);
        t_class = findViewById(R.id.class2);

        btBack = findViewById(R.id.bt_back);

        Intent intent = new Intent();
       Register rg =  (Register) getIntent().getSerializableExtra("Register");



        t_name.setText(rg.getName());
        t_phone.setText(rg.getPhone());
        t_class.setText(rg.getClassname());



        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register rgg = new Register(t_name.getText().toString(),t_phone.getText().toString(),t_class.getText().toString());
                Intent intent = new Intent();
                intent.putExtra("Stu_Register",rgg);
                setResult(5,intent);
                finish();
            }
        });
    }


}
