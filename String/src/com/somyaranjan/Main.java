package com.somyaranjan;

public class Main {

    // 8 Primitive data Types:

    // byte - 1 bytes
    // short - 2 bytes
    // int - 4 bytes
    // long - 8 bytes
    // float - 16 bytes
    // double - 64 bytes
    // char - 2 bytes
    // boolean


    public static void main(String[] args) {

        String myString = " this is a string.";
        System.out.println(myString);

        myString = myString + "And this is more.";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String mylastString = "200";
        int myNumber = 20;

        mylastString = mylastString + myNumber; // Java Converts the int to String.
        System.out.println(mylastString);

    }

    // String is class
}
