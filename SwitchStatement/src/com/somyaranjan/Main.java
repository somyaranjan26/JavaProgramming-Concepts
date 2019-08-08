package com.somyaranjan;

public class Main {

    public static void main(String[] args) {

        char switchVariable = 'A';

        switch(switchVariable) {

            case 'A':
                System.out.println("A Character Is Typed");
                break;

            case 'B':
                System.out.println("B Character Is Typed");
                break;

            case 'C':
                System.out.println("C Character Is Typed");
                break;

            case 'D':
                System.out.println("D Character Is Typed");
                break;

            default:
                System.out.println("Other Character is Typed");
                break;
        }
    }
}
