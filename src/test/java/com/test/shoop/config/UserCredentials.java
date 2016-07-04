package com.test.shoop.config;

/**
 * Created by shabanakhanum on 6/30/16.
 */
public class UserCredentials {

    String userName;
    String password;

    public UserCredentials(String userName,String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }


    public String getPassword() {

        return password;
    }
}
