package com.somyaranjan;


public class intToOther {

    public static void convert(int var) {

        byte a = (byte) var;
        short b = (short) var;
        long c =  var;
        float d = var;
        double e = var;

        System.out.println("Byte: " + a + "\nShort: " + b + "\nLong: " + c + "\nFloat: " + d + "\nDouble: " + e);

    }

}
