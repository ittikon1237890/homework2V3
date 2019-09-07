package com.example.homework2v3.model;

import com.example.homework2v3.R;

public class Auth {
    private static final String EMAIL = "ittikon_new@hotmail.com";
    private static final String PASSWORD = "new0815805234";
    private String mEmail;
    private String mPassword;
    public String getmEmail() {
        return mEmail;
    }
    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
    public String getmPassword() {
        return mPassword;
    }
    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
    public boolean check(){
        if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)){
            return true;
        }else {
            return false;
        }
    }

}
