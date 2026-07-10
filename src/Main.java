import java.lang.*;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String employee_name = " John Smith";
        String email = "John.Smith@ABC.com";
        String empId = "EMP-0123";
        String password = "john@123";
//1. Remove leading/trailing spaces
        System.out.println(employee_name);
        employee_name = employee_name.trim();
        System.out.println();
//2. Convert email to lowercase
        email = email.toLowerCase();
        System.out.println(email);
//
        if (email.contains("@") && email.contains(".com")) {
            System.out.println("it validate email");
        } else {
            System.out.println("invalide email");
        }
        // 5. Generate username
        String username = employee_name.replace(" ", ".").toLowerCase();
        System.out.println(username);

        String[] word = employee_name.split(" ");
        System.out.println(word.length);

        char[] passchar = password.toCharArray();
        boolean tolen = false;
        boolean touppercase = false;
        boolean tolowercase = false;
        boolean tonumber = false;
        boolean tospecial = false;
        if (passchar.length >= 8) {
            tolen = true;
        }

        for (int i = 0; i < passchar.length; i++) {
            char ch = passchar[i];

            if (Character.isLowerCase(ch)) tolowercase = true;
            else if (Character.isUpperCase(ch)) touppercase = true;
            else if (Character.isDigit(ch)) tonumber = true;
            else {
                tospecial = true;
            }
        }
        if (tolen && tolowercase && touppercase && tospecial) {
            System.out.println("it is strong password");
        } else {
            System.out.println("it not strong password");
        }

        int at = email.indexOf('@');
        String wording = email.substring(0, at);
        String domain = email.substring(at);

        if (wording.length() <= 2) {
            System.out.println(email);
        } else {
            StringBuilder masked = new StringBuilder();
            masked.append(wording.substring(0,2));

            for (int i = 2; i < wording.length() ; i++) {
                masked.append("*");
            }

            masked.append('*');
            masked.append(domain);

            System.out.println(masked);

        }

        String domain2 = email.substring(email.indexOf('@')+1);
        System.out.println(domain2);
//


        String str =  employee_name;
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);
        str = username;

        int upper = 0, lower = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Uppercase=" + upper +
                ", Lowercase=" + lower +
                ", Digits=" + digits +
                ", Special=" + special);


        System.out.println(new StringBuilder(employee_name).reverse().toString());

        //   14. Palindrome check
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("equals() = " + s1.equals(s2));
        System.out.println("== = " + (s1 == s2));



    }
}