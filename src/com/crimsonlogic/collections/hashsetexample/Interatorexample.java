package com.crimsonlogic.collections.hashsetexample;

import java.util.*;

import static java.lang.System.exit;

public class Interatorexample {

    HashSet<String> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    void addDepart(){
        System.out.println("enter the depart name");
        set.add(sc.next());
    }
    void displaydepart(){
        Iterator<String> departIterator = set.iterator();

        while (departIterator.hasNext()){
            System.out.println(departIterator.next());
        }
    }
    void search(){
        System.out.print("enter the element you want to search:");
        String  depart = sc.next();
        String ans = set.contains(depart) ?"found "+depart : "not found";
        System.out.println(ans);

    }


    public void helper(){
        while (true){
            System.out.println("""
Enter your choice:
1. Add department
2. Display all departments
3. Search
4. Exit
""");
            try{
                int choice = sc.nextInt();
                switch (choice){
                    case 1 :
                        addDepart();
                        break;
                    case 2 :
                        displaydepart();
                        break;
                    case 3 :
                        search();
                        break;
                    default:
                        System.out.println("exit the code");
                        exit(0);
                }
            }
            catch (InputMismatchException e){
                System.out.println("wrong in type of input enter number please");
                sc.nextLine();
            }


        }
    }

}
