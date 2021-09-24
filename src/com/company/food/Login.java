package com.company.food;

import java.util.HashMap;

public class Login {
    public static String login(String mail, HashMap<String,Account> map,String password){
        String name="";
        if(map.get(mail)==null){
            System.out.println("Account not exists!");
        }else{
            Account acc=map.get(mail);
            String check= acc.getPassword();
            if(check.equals(password)){
                name=acc.getName();
            }
            else{
                System.out.println("Your password does not match.pls enter correct password!");
            }
        }
        return name;
    }
}
