package com.userInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating instance of class Scanner

        System.out.print("Enter Your year of birth: ");

        boolean isInt = input.hasNextInt();    // check weather input is integer or not.
        if (isInt) {
            int birthYear = input.nextInt();    // nextInt() store integer input in a variable
            input.nextLine();   // handle next line character (enter key)

            System.out.print("Enter Your Name: ");
            String name = input.nextLine();

            int age = 2019 - birthYear;

            if (age >= 0 && age <= 100){
                System.out.println("Welcome " + name + ", And you are " + age + " years old.");
            } else {
                System.out.println("You have entered INVALID BIRTH YEAR.");
            }
        } else {
            System.out.println("You have entered INVALID INPUT.");
        }

        input.close();
    }
}
