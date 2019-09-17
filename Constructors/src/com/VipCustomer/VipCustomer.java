package com.VipCustomer;

public class VipCustomer {
    private String Name;
    private double CreditLimit;
    private String EmailAddress;

    VipCustomer() {
        this("Default Name", 50000.00, "Default Email");
        System.out.println("This is default Constructor.");
    }

    VipCustomer(String Name, String EmailAddress) {
        this(Name, 50000.00, EmailAddress);
    }

    VipCustomer(String Name, double CreditLimit, String EmailAddress) {
        this.Name = Name;
        this.CreditLimit = CreditLimit;
        this.EmailAddress = EmailAddress;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
