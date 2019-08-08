package com.somyaranjan;

public class Main {

    // Integral Primitive Data Types : byte, short, int, long.

    public static void main(String[] args) {


        // width of int = 32 (4 bytes)
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int intTotal = ((myMaxValue + myMinValue) / 2);
        System.out.println("intTotal = " + intTotal);

        // width of byte = 8 (1 bytes)
        byte myMinByte = -128;
        byte myMaxByte = 127;

        byte byteTotal = (byte) ((myMinByte + myMaxByte) / 2);
        System.out.println("byteTotal = " + byteTotal);

        // width of short = 16 (2 bytes)
        short myMinShort = -32_768;
        short myMaxShort = 32_767;

        short shortTotal = (short) ((myMinShort + myMaxShort) / 2);
        System.out.println("shortTotal = " + shortTotal);

        // width of long = 64 (8 bytes)
        long myMinLong = -9_223_372_036_854_775_808L;
        long myMaxLong = 9_223_372_036_854_775_807L;

        long longTotal = (long) ((myMinLong + myMaxLong) / 2);
        System.out.println("longTotal = " + longTotal);

        /*
            * We can also write large numbers like 9_223_372_036_854_775_807L, this feature came in java 7.
            * Java by default take right side value of assignment as int to undo that we use casting.
              to change the int data type to require data type.
            * We have to write L/l after long values as it's larger than int.

        */
    }
}
