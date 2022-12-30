package com.example.musicDemo.pojo;

public class AdmitUser {
    private Integer admit_id;
    private String  admit_name;
    private String admit_password;
    public Integer getAdmit_id() {
        return admit_id;
    }

    public void setAdmit_id(Integer admit_id) {
        this.admit_id = admit_id;
    }

    public String getAdmit_name(String admit_name) {
        return this.admit_name;
    }

    public void setAdmit_name(String admit_name) {
        this.admit_name = admit_name;
    }

    public String getAdmit_password(String admit_password) {
        return this.admit_password;
    }

    public void setAdmit_password(String admit_password) {
        this.admit_password = admit_password;
    }

}
