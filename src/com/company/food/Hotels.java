package com.company.food;
import java.util.HashMap;
import java.util.Scanner;

public class Hotels {
    static Scanner scan=new Scanner(System.in);
    public static void getHotelList(){
        System.out.println("Please choose the hotel:");
        System.out.println("1.Arya_bhavan");
        System.out.println("2.Banu_hotel");
        System.out.println("3.SR_Bhavan");
        System.out.println("4.Exit");
        System.out.println("Please select the hotel");
        int option=scan.nextInt();
        switch(option){
            case 1:
                System.out.println("Welcome to Hotel Arya_bhavan");
                chooseFood();
                break;
            case 2:
                System.out.println("Welcome to Banu_hotel");
                chooseFood();
                break;
            case 3:
                System.out.println("Welcome to Hotel SR_bhavan");
                chooseFood();
                break;
            case 4:
                return;
        }
    }
    public static void chooseFood(){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,70);
        map.put(2,100);
        map.put(3,90);
        map.put(4,15);
        map.put(5,75);
        map.put(6,80);
        map.put(7,90);
        map.put(8,120);
        map.put(9,35);
        int amount=0;
        System.out.println("1.Sandwich         70");
        System.out.println("2.Pizza           100");
        System.out.println("3.Fried_Rice       90");
        System.out.println("4.Parotta          15");
        System.out.println("5.Noodles          75");
        System.out.println("6.Chicken_Rice     80");
        System.out.println("7.Chicken_Briyani  90");
        System.out.println("8.Prawn            120");
        System.out.println("9.Faloda            35");
        System.out.println("10.Cart");
        System.out.println("11.Exit");
        while(true){
        System.out.println("Please enter your choice:");
        int choice=scan.nextInt();
        if(choice>=1&&choice<=9){
            amount+=map.get(choice);
        }
        if(choice==10){
            System.out.println("------------Cart------------");
            System.out.println("Your total order amount is"+amount);
            System.out.println("Do you wish to order(1/0):");
            int answer= scan.nextInt();
            if(answer==1){
                System.out.println("Your order placed!");
            }
            else{
                System.out.println("Do you wish to cancel any item or add any item in your cart!!");
                System.out.println("1.Add item");
                System.out.println("2.Cancel item");
                System.out.println("3.Cancel order");
                System.out.println("Enter your choice:");
                int choice2=scan.nextInt();
                if(choice2==2){
                    System.out.println("Which item you want to cancel?");
                    choice2=scan.nextInt();
                    amount-=map.get(choice2);
                }
                else if(choice==3){
                    System.out.println("Your order is cancelled!!");
                    return;
                }
            }
        }
        if(choice==11){
            return;
        }
        }
    }
}
