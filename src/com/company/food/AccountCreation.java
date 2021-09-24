package com.company.food;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AccountCreation {
    public static HashMap<String,Account> createAcc(Account account, String email,HashMap map) {
        //HashMap<String,List<Account>> map=new HashMap<>();
        if(map.get(email)==null){
            map.put(email,account);
        }
        else{
            System.out.println("Account already exists.please login!!!");
        }
        //System.out.println("Map is"+map);
        return map;
    }
}
