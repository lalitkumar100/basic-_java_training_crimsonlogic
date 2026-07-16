package com.crimsonlogic.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListExample {

    List<Integer> numberlist = new ArrayList<>();

    public void addElementInArrayList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please! Please! I beging your enter number of elelement you need");
        int size = sc.nextInt();

        System.out.println("now the size of "+numberlist.size());

        for (int i = 0; i <size; i++) {
            int k = ThreadLocalRandom.current().nextInt(10, 51); //
            if(k==0){
                System.out.println("please please I begging you enter the element");
            } else if (k==size-1) {
                System.out.println("i Promise thie last time i am asking you please enter element");
            }
            else {
                System.out.println("please please enter different element again");
            }
            int ele = sc.nextInt();
            numberlist.add(ele);
        }
        System.out.println("now the size of "+numberlist.size());
        sc.close();
    }

}
