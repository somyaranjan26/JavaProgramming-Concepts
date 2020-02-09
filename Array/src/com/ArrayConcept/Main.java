package com.ArrayConcept;

public class Main {

    public static void main(String[] args) {

        int[] oneArray = { 1,4,6,2,3};
        System.out.println(oneArray[4]);
        // This Technique is only applicable when array is initialize for first time.

        int[] twoArray = new int[5];

        for (int i=0; i<twoArray.length; i++) {  // by using length keyword loop get executed,
            twoArray[i] = i*10;                  // independent of array size.
        }

        for (int i=0; i<twoArray.length; i++) {
            System.out.println("Array Element: " + i + " = " +twoArray[i]);
        }

        System.out.println();

        for (int value : twoArray) {
            System.out.println("Array Element: "+value);
        }

        System.out.println();

        printArray(twoArray);
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Method Element: " + i + " = " +array[i]);
        }
    }
}
