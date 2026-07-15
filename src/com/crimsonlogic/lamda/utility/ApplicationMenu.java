package com.crimsonlogic.lamda.utility;

import com.crimsonlogic.lamda.math_calculator.BonusCalculatorIMP;
import com.crimsonlogic.lamda.math_calculator.CalculatorIMPL;
import com.crimsonlogic.lamda.string_func.StringOperations;
import com.crimsonlogic.lamda.area_calculator.AeraCalculotor;

import java.util.Scanner;

public class ApplicationMenu {

    public void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Calculator");
        System.out.println("2. Bonus Calculator");
        System.out.println("3. String Operations");
        System.out.println("4. Area Calculator");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                new CalculatorIMPL().calculatorFunc();
                break;

            case 2:
                new BonusCalculatorIMP().displayBonus();
                break;

            case 3:
                new StringOperations().stringFunc();
                break;

            case 4:
                new AeraCalculotor().calculator();
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}