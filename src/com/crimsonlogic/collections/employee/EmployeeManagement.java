package com.crimsonlogic.collections.employee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    ArrayList<Employee> staff = new ArrayList<>();
    Scanner sc =  new Scanner(System.in);
    void addEmployee(){
        Employee e = new Employee();
        System.out.print("Enter Employee Name :");
        e.setName(sc.nextLine());

        System.out.print("Enter Employee ID :");
        e.setEmpId(sc.nextInt());

        System.out.print("Enter Employee department :");
        e.setDepartment(sc.nextLine());

        System.out.print("Enter Employee salary :");
        e.setSalalry(sc.nextDouble());


        System.out.print("Enter Employee email :");
        e.setEmail(sc.nextLine());

        System.out.print("Enter Employee Experience : :");
        e.setExperience(sc.nextInt());

        displayEmployee(e);
        staff.add(e);
        System.out.println("add the Employee as staff memeber");

    }
    void displayEmployee(Employee e){
        System.out.println("====EMPLOYEE=============" +
                "\n"+e.toString());

    }
    // Display all employees
    void displayEmployees() {

        if (staff.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        for (Employee e : staff) {
            displayEmployee(e);
        }
    }
    void searchEmployee() {

        sc.nextLine(); // clear buffer if needed

        System.out.println("Search Employee By:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Department");
        System.out.println("4. Salary");
        System.out.println("5. Experience");
        System.out.println("6. Email");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        String field = "";

        switch (choice) {
            case 1:
                field = "id";
                break;
            case 2:
                field = "name";
                break;
            case 3:
                field = "department";
                break;
            case 4:
                field = "salary";
                break;
            case 5:
                field = "experience";
                break;
            case 6:
                field = "email";
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.print("Enter " + field + ": ");
        String value = sc.nextLine();

        search(field, value);
    }
    void search(String field, String value) {

        boolean found = false;

        for (Employee e : staff) {

            switch (field.toLowerCase()) {

                case "id":
                    if (e.getEmpId() == Integer.parseInt(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                case "name":
                    if (e.getName().equalsIgnoreCase(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                case "department":
                    if (e.getDepartment().equalsIgnoreCase(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                case "salary":
                    if (e.getSalalry() == Double.parseDouble(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                case "experience":
                    if (e.getExperience() == Integer.parseInt(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                case "email":
                    if (e.getEmail().equalsIgnoreCase(value)) {
                        displayEmployee(e);
                        found = true;
                    }
                    break;

                default:
                    System.out.println("Invalid field.");
                    return;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    // Update employee salary using ID
    void updateSalary(int id) {

        System.out.print("Enter New Salary : ");
        double salary = sc.nextDouble();

        for (Employee e : staff) {

            if (e.getEmpId() == id) {

                e.setSalalry(salary);
                System.out.println("Salary Updated.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }
    // Delete employee by ID
    void deleteEmployee(int id) {

        for (Employee e : staff) {

            if (e.getEmpId() == id) {

                staff.remove(e);
                System.out.println("Employee Deleted.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Find employee with highest salary
    void highestSalary() {

        if (staff.isEmpty()) {
            System.out.println("No Employees.");
            return;
        }

        Employee high = staff.get(0);

        for (Employee e : staff) {

            if (e.getSalalry() > high.getSalalry()) {
                high = e;
            }
        }

        System.out.println("Highest Salary Employee");
        displayEmployee(high);
    }


    // Sort employees by salary
    void sortBySalary() {

        staff.sort((a, b) -> Double.compare(a.getSalalry(), b.getSalalry()));

        displayEmployees();
    }
    // Sort employees alphabetically
    void sortByName() {

        staff.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        displayEmployees();
    }
    // Calculate average salary
    void averageSalary() {

        if (staff.isEmpty()) {
            System.out.println("No Employees.");
            return;
        }

        double total = 0;

        for (Employee e : staff) {
            total += e.getSalalry();
        }

        System.out.println("Average Salary : " + total / staff.size());
    }
    // Display employees having experience greater than 5 years
    void experiencedEmployees(int year) {

        boolean found = false;

        for (Employee e : staff) {

            if (e.getExperience() > year) {

                displayEmployee(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Experienced Employees.");
        }
    }

}
