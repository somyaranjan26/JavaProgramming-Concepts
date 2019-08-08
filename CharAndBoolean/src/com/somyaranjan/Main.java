package com.somyaranjan;

public class Main {

    public static void main(String[] args) {

        // width of char is 16 (2 bytes)
        char myChar = '\u00A9';

        char challenge = '\u00AE';

        System.out.println(myChar);
        System.out.println(challenge);

        boolean myBoolean = true;

        System.out.println(myBoolean);


    }
}
