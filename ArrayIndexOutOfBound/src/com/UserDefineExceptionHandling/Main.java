package com.UserDefineExceptionHandling;

import java.util.Scanner;

class ArrayIndexOutOfBound extends Exception {
    int Extra;
    ArrayIndexOutOfBound(int SizeOfArray, int NumberOfElement) {
        Extra = NumberOfElement - SizeOfArray;
    }
    public String toString() {
        return "\t\t\tYou Have Entered " + Extra + " Extra Numbers.";
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\tEnter Size Of Array: ");
        int SizeOfArray = input.nextInt();
        int array[] = new int[SizeOfArray];

        System.out.print("\tEnter Number Elements: ");
        int NumberOfElement = input.nextInt();

        try {
            if (NumberOfElement > SizeOfArray) {
                throw new ArrayIndexOutOfBound(SizeOfArray, NumberOfElement);
            }
            else {
                int i=0;
                while (i<NumberOfElement) {
                    System.out.print("\t\tEnter " + (i+1) + " Number: ");

                    if (input.hasNextInt()) { //
                        array[i] = input.nextInt();
                        i++;
                    } else {
                        System.out.println("\t\t\tYou Have Entered INVALID INPUT.");
                    }
                    input.nextLine();
                }
            }
        }
        catch (ArrayIndexOutOfBound object) {
            System.out.println(object); /* if Print Any Object, It calls toString()
                                        Function If it is exist In That Respective Class
                                        Other wise It Will Print Name Of The Respective Class */
        }
        finally {
            System.out.println("\t\t\tHope You Liked...🙂");
        }
    }
}
