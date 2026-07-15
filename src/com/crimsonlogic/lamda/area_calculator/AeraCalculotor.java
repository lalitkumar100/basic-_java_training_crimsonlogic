
package com.crimsonlogic.lamda.area_calculator;

import java.util.Scanner;

public class AeraCalculotor {

    public void calculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Choice");
        System.out.println("Circle : 1");
        System.out.println("Rectangle : 2");
        System.out.println("Triangle : 3");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                CircleArea c = (radius) -> {
                    System.out.println("Circle Area = " + (Math.PI * radius * radius));
                };

                System.out.println("Enter Radius:");
                double radius = sc.nextDouble();

                c.calculate(radius);
                break;

            case 2:
                RectangleArea r = (length, width) -> {
                    System.out.println("Rectangle Area = " + (length * width));
                };

                System.out.println("Enter Length:");
                double length = sc.nextDouble();

                System.out.println("Enter Width:");
                double width = sc.nextDouble();

                r.calculate(length, width);
                break;

            case 3:
                TriangleArea t = (base, height) -> {
                    System.out.println("Triangle Area = " + (0.5 * base * height));
                };

                System.out.println("Enter Base:");
                double base = sc.nextDouble();

                System.out.println("Enter Height:");
                double height = sc.nextDouble();

                t.calculate(base, height);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }


}
