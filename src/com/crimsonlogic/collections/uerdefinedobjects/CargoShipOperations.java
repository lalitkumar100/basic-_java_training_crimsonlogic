package com.crimsonlogic.collections.uerdefinedobjects;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class CargoShipOperations {

    ArrayList<CargoShip> cargoShipsList  = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addCargoShip(){

        System.out.println("ENTER THE NUMBER OF CARGOSHIP TO ADD IN THIS LIST");
        CargoShip c= null;
        int noOfCargoShips = sc.nextInt();
        for(int i=0;i<noOfCargoShips;i++){
            c =new CargoShip();
            System.out.println("============ship "+(i+1)+" ===================");
            System.out.print("enter the name of ship :");
            c.setCargoShipName(sc.next());

            System.out.print("enter the Id of ship :");
            c.setCargoShipId(sc.nextInt());

            System.out.println("enter the Capacity of ship :");
            c.setCargoShipCapacity(sc.nextInt());

            sc.nextLine();

            cargoShipsList.add(c);
            System.out.println("is Added "+cargoShipsList.get(i).toString());



        }
    }

  public   void displayDetialsCargoShip() throws CargoShipNotFoundException {

        for(CargoShip ship : cargoShipsList){

            System.out.println( "ENTER THE NAME OF CARGOsHIP USE WANT TO SEARCH BELOW");
            String name = sc.nextLine();
            if(ship.getCargoShipName().equals(name)){
                System.out.println("ship is found");
            }
            else {
                throw  new CargoShipNotFoundException("ship is not found "+name);
            }
        }
    }
}
