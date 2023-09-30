package org.example;

import java.util.ResourceBundle;

public class Main {
    public int user_Login(String user_IN, String user_pwd){
        ResourceBundle re=ResourceBundle.getBundle("config");
        String user=re.getString("Username");
        String pwd=re.getString("Password");

        if(user.equals(user_IN) && pwd.equals(user_pwd)){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}