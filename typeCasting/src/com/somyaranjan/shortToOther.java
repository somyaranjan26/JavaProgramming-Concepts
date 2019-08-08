package com.somyaranjan;

public class shortToOther {

    public static void convert(short var) {

        byte a = (byte) var;
        int b =  var;
        long c =  var;
        float d = var;
        double e = var;

        System.out.println("Byte: " + a + "\nInt: " + b + "\nLong: " + c + "\nFloat: " + d + "\nDouble: " + e);
    }
}
