package com.crimsonlogic.collections.uerdefinedobjects;
import java.util.Scanner;

public class  Arrayexample{

    CargoShip[] cargoShips;
    Scanner sc = new Scanner(System.in);

    public void addCargoShip() {

        System.out.println("ENTER THE NUMBER OF CARGO SHIPS TO ADD:");
        int noOfCargoShips = sc.nextInt();

        cargoShips = new CargoShip[noOfCargoShips];

        for (int i = 0; i < noOfCargoShips; i++) {

            CargoShip c = new CargoShip();

            System.out.println("========== Ship " + (i + 1) + " ==========");

            System.out.print("Enter the name of ship: ");
            c.setCargoShipName(sc.next());

            System.out.print("Enter the ID of ship: ");
            c.setCargoShipId(sc.nextInt());

            System.out.print("Enter the capacity of ship: ");
            c.setCargoShipCapacity(sc.nextInt());

            cargoShips[i] = c;

            System.out.println("Added: " + cargoShips[i]);
        }
    }

    public void displayDetailsCargoShip() throws CargoShipNotFoundException {

        sc.nextLine(); // clear buffer

        System.out.println("ENTER THE NAME OF CARGO SHIP YOU WANT TO SEARCH:");
        String name = sc.nextLine();

        boolean found = false;

        try {
            for (CargoShip ship : cargoShips) {
                if (ship != null && ship.getCargoShipName().equalsIgnoreCase(name)) {
                    System.out.println("Ship Found");
                    System.out.println(ship);
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new CargoShipNotFoundException("Ship not found: " + name);
            }
        }
        catch (CargoShipNotFoundException e){
            System.out.println("ship with this name is not found ");
        }
    }
}