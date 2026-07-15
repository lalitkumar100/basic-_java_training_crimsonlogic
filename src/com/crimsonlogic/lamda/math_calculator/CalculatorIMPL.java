package com.crimsonlogic.lamda.math_calculator;

import java.util.Scanner;

public class CalculatorIMPL {

    public void calculatorFunc() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        Calculator c = null;

        switch (choice) {

            case 1:
                c = (a, b) -> a + b;
                break;

            case 2:
                c = (a, b) -> a - b;
                break;

            case 3:
                c = (a, b) -> a * b;
                break;

            case 4:
                c = (a, b) -> (double) a / b;
                break;

            case 5:
                c = (a, b) -> a % b;
                break;

            default:
                System.out.println("Invalid Choice");
        }

        if (c != null) {
            System.out.println("Result : " + c.calculate(num1, num2));
        }

        sc.close();
    }
}