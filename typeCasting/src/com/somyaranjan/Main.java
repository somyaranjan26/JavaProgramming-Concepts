package com.somyaranjan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Byte Value: ");
        byte var_b = sc.nextByte();
        byteToOther.convert(var_b);

        System.out.print("Enter Short Value: ");
        short var_s = sc.nextShort();
        shortToOther.convert(var_s);

        System.out.print("Enter Int Value: ");
        int var_i = sc.nextInt();
        intToOther.convert(var_i);

//        float var_f = sc.nextFloat();

    }
}
