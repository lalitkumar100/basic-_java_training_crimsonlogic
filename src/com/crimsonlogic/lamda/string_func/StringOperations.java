package com.crimsonlogic.lamda.string_func;

import java.util.Scanner;

public class StringOperations {

    String inputValue = null;
    int choice = 0;

    public void stringFunc() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        System.out.println("3. Reverse String");
        System.out.println("4. Find Length");
        System.out.println("5. Print Each Character");
        System.out.println("6. Count Characters");
        System.out.println("7. Check Empty");
        System.out.println("8. Trim Spaces");
        System.out.println("9. Replace Spaces With Underscore");
        System.out.println("10. Remove Vowels");
        System.out.println("11. Starts With A");
        System.out.println("12. Ends With .java");
        System.out.println("13. Contains Java");
        System.out.println("14. Contains Only Alphabets");
        System.out.println("15. Contains Only Digits");
        System.out.println("16. Contains Special Characters");
        System.out.println("17. Length Greater Than 10");
        System.out.println("18. Palindrome Check");
        System.out.println("19. Email Validation");
        System.out.println("20. Blank Check");
        System.out.println("21. Count Vowels");
        System.out.println("22. Count Consonants");
        System.out.println("23. Count Uppercase Letters");
        System.out.println("24. Count Lowercase Letters");
        System.out.println("25. Count Digits");
        System.out.println("26. Count Words");
        System.out.println("27. Find Longest Word");
        System.out.println("28. Find Shortest Word");
        System.out.println("29. First Character");
        System.out.println("30. Last Character");
        System.out.print("Enter Your Choice: ");



        choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter String : ");
        inputValue = sc.nextLine();

        StringManipulation s = null;

        switch (choice) {

            case 1:
                s = str -> {
                    System.out.println("UPPER CASE : "
                            + str.toUpperCase());
                };
                break;

            case 2:
                s = str -> {
                    System.out.println("LOWER CASE : "
                            + str.toLowerCase());
                };
                break;

            case 3:
                s = str -> {
                    System.out.println("REVERSE : "
                            + new StringBuilder(str).reverse());
                };
                break;

            case 4:
                s = str -> {
                    System.out.println("LENGTH : "
                            + str.length());
                };
                break;

            case 5:
                s = str -> {
                    str.chars()
                            .mapToObj(c -> (char) c)
                            .forEach(System.out::println);
                };
                break;

            case 6:
                s = str -> {
                    System.out.println("Character Count : " + str.length());
                };
                break;

            case 7:
                s = str -> {
                    System.out.println(
                            str.isEmpty()
                                    ? "String is Empty"
                                    : "String is Not Empty");
                };
                break;

            case 8:
                s = str -> {
                    System.out.println("After Trim : " + str.trim());
                };
                break;

            case 9:
                s = str -> {
                    System.out.println(
                            "Result : " +
                                    str.replace(" ", "_"));
                };
                break;

            case 10:
                s = str -> {
                    System.out.println(
                            "Without Vowels : " +
                                    str.replaceAll("[AEIOUaeiou]", ""));
                };
                break;

            case 11:
                s = str -> {
                    System.out.println(
                            str.startsWith("A")
                                    ? "Starts With A"
                                    : "Does Not Start With A");
                };
                break;

            case 12:
                s = str -> {
                    System.out.println(
                            str.endsWith(".java")
                                    ? "Ends With .java"
                                    : "Does Not End With .java");
                };
                break;

            case 13:
                s = str -> {
                    System.out.println(
                            str.contains("Java")
                                    ? "Contains Java"
                                    : "Does Not Contain Java");
                };
                break;
            case 14:
                s = str -> {
                    System.out.println(
                            str.matches("[a-zA-Z]+")
                                    ? "Only Alphabets"
                                    : "Contains Other Characters");
                };
                break;

            case 15:
                s = str -> {
                    System.out.println(
                            str.matches("\\d+")
                                    ? "Only Digits"
                                    : "Not Only Digits");
                };
                break;
            case 18:
                s = str -> {
                    String rev = new StringBuilder(str)
                            .reverse()
                            .toString();

                    System.out.println(
                            str.equalsIgnoreCase(rev)
                                    ? "Palindrome"
                                    : "Not Palindrome");
                };
                break;

            case 19:
                s = str -> {
                    System.out.println(
                            str.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
                                    ? "Valid Email"
                                    : "Invalid Email");
                };
                break;

            case 20:
                s = str -> {
                    System.out.println(
                            str.isBlank()
                                    ? "String is Blank"
                                    : "String is Not Blank");
                };
                break;

            case 21:
                s = str -> {
                    long count = str.chars()
                            .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
                            .count();

                    System.out.println("Vowel Count : " + count);
                };
                break;

            case 22:
                s = str -> {
                    long count = str.chars()
                            .filter(Character::isLetter)
                            .filter(ch -> "AEIOUaeiou".indexOf(ch) == -1)
                            .count();

                    System.out.println("Consonant Count : " + count);
                };
                break;

            case 23:
                s = str -> {
                    long count = str.chars()
                            .filter(Character::isUpperCase)
                            .count();

                    System.out.println("Uppercase Letters : " + count);
                };
                break;

            case 24:
                s = str -> {
                    long count = str.chars()
                            .filter(Character::isLowerCase)
                            .count();

                    System.out.println("Lowercase Letters : " + count);
                };
                break;

            case 25:
                s = str -> {
                    long count = str.chars()
                            .filter(Character::isDigit)
                            .count();

                    System.out.println("Digit Count : " + count);
                };
                break;

            case 26:
                s = str -> {
                    System.out.println(
                            "Words : "
                                    + str.trim().split("\\s+").length);
                };
                break;

            case 27:
                s = str -> {
                    String[] words = str.split("\\s+");
                    String longest = words[0];

                    for(String word : words){
                        if(word.length() > longest.length()){
                            longest = word;
                        }
                    }

                    System.out.println("Longest Word : " + longest);
                };
                break;

            case 28:
                s = str -> {
                    String[] words = str.split("\\s+");
                    String shortest = words[0];

                    for(String word : words){
                        if(word.length() < shortest.length()){
                            shortest = word;
                        }
                    }

                    System.out.println("Shortest Word : " + shortest);
                };
                break;

            case 29:
                s = str -> {
                    System.out.println(
                            "First Character : "
                                    + str.charAt(0));
                };
                break;

            case 30:
                s = str -> {
                    System.out.println(
                            "Last Character : "
                                    + str.charAt(str.length() - 1));
                };
                break;



            default:
                System.out.println("Wrong Input");
        }
        if(s!= null)  s.StringFunc(inputValue);

        sc.close();
    }
}