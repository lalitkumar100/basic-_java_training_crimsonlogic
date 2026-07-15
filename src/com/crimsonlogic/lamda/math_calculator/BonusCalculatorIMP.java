package com.crimsonlogic.lamda.math_calculator;

import java.util.Scanner;

public class BonusCalculatorIMP implements BonusCalculator {

    @Override
    public double calculate(double salary, double percent) {
        return salary * percent / 100;
    }

    public void displayBonus() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter Bonus Percentage : ");
        double percent = sc.nextDouble();

        double bonus = calculate(salary, percent);

        System.out.println("Salary : " + salary);
        System.out.println("Bonus Percentage : " + percent + "%");
        System.out.println("This Year Bonus : " + bonus);

        sc.close();
    }
}