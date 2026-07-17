package com.crimsonlogic.collections.hashsetexample.product;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class PrdouctOperations {

    HashSet<Product> productList = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    void addNewProduct(){
     try{
         System.out.print("Enter the new product name: ");
         String name = sc.nextLine();

         if(name.trim().isEmpty()){
             throw new Exception(" empty inputs");
         }

         System.out.print("Enter the new product ID: ");
         int id = sc.nextInt();


         System.out.print("Enter the new product quantity: ");
         int qty = sc.nextInt();

         System.out.print("Enter the new product price: ");
         double price = sc.nextDouble();

         sc.nextLine(); // Consume the newline after nextDouble() if you'll read another line later


         Product product = new Product(id,name.toLowerCase(),price,qty);


         if(!productList.contains(product)){
             productList.add(product);
         }
         else{
             throw new Exception("product is already exist");
         }
     }
     catch ( Exception e){
         System.out.println(e.getMessage());
     }
    }

    void display()  {
      try{
          Iterator<Product> prodcutInterator =  productList.iterator();
          if(!prodcutInterator.hasNext()){
              throw new Exception("list is Empty");
          }
          while(prodcutInterator.hasNext()){
              System.out.println(prodcutInterator.next().toString());
          }
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
    }

    void search()  {
        try{
            System.out.println("enter the new product name");
            String name =  sc.nextLine();
             name =name.toLowerCase();
            if(name.trim().isEmpty()){
                throw new Exception(" empty inputs");
            }


            Iterator<Product> prodcutInterator =  productList.iterator();
            boolean found = false;
            if(!prodcutInterator.hasNext()){
                throw new Exception("list is Empty");
            }
            while(prodcutInterator.hasNext()){
               if(name.equals(prodcutInterator.next().getProductName())){
                   found=true;
                   System.out.println("found product :"+name);
                   break;
               }
            }
            if(!found){
              throw  new Exception("product not found");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void filterByR(){
        try{

            Iterator<Product> prodcutInterator =  productList.iterator();
            int i=0;
            boolean found=false;
            while(prodcutInterator.hasNext()){
                String name =prodcutInterator.next().getProductName();
                if(name.startsWith("r")){
                    found=true;
                    System.out.println((++i)+" : "+name);

                }
            }
            if(!found){
                throw  new Exception("product not found start with R");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void helper() {
        while (true) {
            try {
                System.out.println("\n===== Product Management =====");
                System.out.println("1. Add Product");
                System.out.println("2. Display Products");
                System.out.println("3. Search Product");
                System.out.println("4. Filter Products Starting with R");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline left by nextInt()

                switch (choice) {
                    case 1:
                        addNewProduct();
                        break;

                    case 2:
                        display();
                        break;

                    case 3:
                        search();
                        break;

                    case 4:
                        filterByR();
                        break;

                    case 5:
                        System.out.println("Thank you! Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); // clear invalid input
            }
        }
    }


}
