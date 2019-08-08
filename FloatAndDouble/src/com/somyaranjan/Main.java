package com.somyaranjan;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int intValue = 5 / 2;

        // width of float = 32 (4 bytes)
        float floatValue = 5f / 3f;   // float have 7 precision digits

        // width of double = 64 (8 bytes)
        double doubleValue = 5d / 3d;   // doubles have 16 precision digit

        System.out.println("intValue = " + intValue);
        System.out.println(("floatValue = " + floatValue));
        System.out.println(("doubleValue = " + doubleValue));

    }
}
