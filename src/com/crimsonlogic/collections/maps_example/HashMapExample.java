package com.crimsonlogic.collections.maps_example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HashMapExample {

    HashMap<Integer,Double> orderDetails = new HashMap<>();
    Scanner sc =new Scanner(System.in);

    public void insertValuesInHashMap(){

        System.out.println("Enter no of Order you want");
        int size = sc.nextInt();

        for(int i =0;i<size ;i++){
            try{
                System.out.print("enter order id:");
                int id = sc.nextInt();
                System.out.println("enter amount :");
                double amount = sc.nextDouble();
                orderDetails.put(id, amount);
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("RE-ENTER !!!!!");
                i--;
            }


        }
    }
}
