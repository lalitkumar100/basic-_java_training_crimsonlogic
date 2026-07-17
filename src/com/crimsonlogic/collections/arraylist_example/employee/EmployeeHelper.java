package com.crimsonlogic.collections.arraylist_example.employee;

import java.util.Scanner;

public class EmployeeHelper {

   void  helper(){
        EmployeeManagement em = new EmployeeManagement();

        while (true) {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Update Salary");
            System.out.println("5.Delete Employee");
            System.out.println("6.Highest Salary Employee");
            System.out.println("7.Experience > 5");
            System.out.println("8.Sort By Salary");
            System.out.println("9.Sort By Name");
            System.out.println("10.Average Salary");
            System.out.println("11.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Choice : ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    em.addEmployee();
                    break;

                case 2:
                    em.displayEmployees();
                    break;

                case 3:
                    em.searchEmployee();
                    break;

                case 4:
                    System.out.println("enter the Id of employee youn want to updated");
                    em.updateSalary(sc.nextInt());
                    break;

                case 5:
                    System.out.print("how many experience year you need:");
                    em.deleteEmployee(sc.nextInt());
                    break;

                case 6:
                    em.highestSalary();
                    break;

                case 7:
                    System.out.print("how amny experience men you need:");
                    em.experiencedEmployees(sc.nextInt());
                    break;

                case 8:
                    em.sortBySalary();
                    break;

                case 9:
                    em.sortByName();
                    break;

                case 10:
                    em.averageSalary();
                    break;

                case 11:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
