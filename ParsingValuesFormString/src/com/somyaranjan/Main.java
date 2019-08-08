package com.somyaranjan;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
	    int number = 2018;

        System.out.println("Number As Number :" + numberAsString);
        System.out.println("Number :" + number);

	    int ParsValue = Integer.parseInt(numberAsString);

	    numberAsString += 1;
	    number += 1;

        System.out.println("Number As Number :" + numberAsString);
        System.out.println("Number :" + number);
    }
}
