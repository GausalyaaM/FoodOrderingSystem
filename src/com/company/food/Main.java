package com.company.food;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        HashMap<String,Account> map=new HashMap<>();
	Scanner scan=new Scanner(System.in);
        System.out.println("Hey");
    while(true){
        System.out.println("Welcome to food ordering system");
        System.out.println("1.SignUp");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.println("Enter your choice:");
        int choice= scan.nextInt();
        switch(choice){
            case 1:
                //List<Account> list=new ArrayList<>();
                System.out.println("Enter your name:");
                String name=scan.next();
                System.out.println("Enter your age:");
                int age=scan.nextInt();
                System.out.println("Enter your email id:");
                String mailId=scan.next();
                System.out.println("Enter password:");
                String password=scan.next();

                if(password.length()<8||password.length()>12){
                    System.out.println("Your password length is inappropriate!!Length must betwwen 8 to 12 ");
                    return;
                }
                System.out.println("Enter confirm password:");
                String confirmPassword=scan.next();
                if(!password.equals(confirmPassword)){
                    System.out.println(("You have entered wrong password!!!"));
                    return;
                }
                System.out.println("Enter your mobile number:");
                long number=scan.nextLong();
                Account account=new Account();
                account.setAge(age);
                account.setEmail(mailId);
                account.setName(name);
                account.setNumber(number);
                account.setPassword(password);
                //list.add(account);
                AccountCreation.createAcc(account,mailId,map);
                break;
            case 2:
                System.out.println("Enter your email id:");
                String mail=scan.next();
                System.out.println("Enter password:");
                String pass=scan.next();
                String user=Login.login(mail,map,pass);
                System.out.println("Welcome "+user+" "+"You have successfully logged in!!");
                System.out.println("We provide two ways of search:");
                System.out.println("1.Search by hotels");
                System.out.println("2.Search by food");
                System.out.println("3.Exit");
                System.out.println("Enter your choice:");
                int choice1=scan.nextInt();
                switch(choice1){
                    case 1:
                        Hotels.getHotelList();
                        break;
                    case 2:
                        Hotels.chooseFood();
                        break;
                    case 3:
                        return;
                }
                break;
            case 3:
                return;
        }
    }
    }
}
