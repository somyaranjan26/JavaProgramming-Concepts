package com.VipCustomer;
/* Create a class which should have 3 fields name, credit limit, email address.
   create 3 constructors,
   1st constructor empty, should call the constructor with 3 parameters with default values
   2nd constructor should pass 2 values it receives and add a default value for the 3rd
   3rd constructor should save all the fields.
   create getters.
*/

public class Main {

    public static void main(String[] args) {
	    VipCustomer Ram = new VipCustomer();
        System.out.println(Ram.getName() + " " +
            Ram.getCreditLimit() + " " +
            Ram.getEmailAddress());

        VipCustomer Sham = new VipCustomer("Sham", "Sham@gmail.com");
        System.out.println(Sham.getName() + " " +
            Sham.getCreditLimit() + " " +
            Sham.getEmailAddress());

        VipCustomer Bam = new VipCustomer("Bam", 200.59, "Bam@gmail.com");
        System.out.println(Bam.getName() + " " +
            Bam.getCreditLimit() + " " +
            Bam.getEmailAddress());
    }
}
