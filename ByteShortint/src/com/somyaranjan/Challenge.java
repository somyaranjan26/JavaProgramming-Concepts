package com.somyaranjan;

public class Challenge {

    public static void main(String[] args){

        // creating a variable of type byte
        byte byteValue = 127;

        // creating a variable of type short
        short shortValue = 32767;

        // creating a variable of type int
        int intValue = 50123;

        // creating a variable of type long
        long longValue = (long) (50000 + 10 * (byteValue + shortValue + intValue));

        // We can also do this
        //long longValue =  (50000L + 10L * (byteValue + shortValue + intValue));

        // Printing Long Value
        System.out.println("Final Value = " + longValue);
    }
}
