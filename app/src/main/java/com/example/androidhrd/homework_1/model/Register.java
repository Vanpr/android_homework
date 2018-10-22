package com.example.androidhrd.homework_1.model;

import java.io.Serializable;

public class Register implements Serializable {

    private String name , phone , classname;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Register(String name, String phone, String classname) {
        this.name = name;
        this.phone = phone;
        this.classname = classname;
    }
    public  Register(){

    }


}
