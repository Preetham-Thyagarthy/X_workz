package com.xworkz.inheritence.internal.bank;

public class HDFCBank extends Bank {
    public HDFCBank() {
        super();
        System.out.println("Running non-arg constructor HDFC Bank");
    }
    @Override
    public void deposit() {

        System.out.println("Money in deposited");
    }
    @Override
    public void withdraw() {

        System.out.println("Money is withdrawed");
    }
    @Override
    public void loan() {

        System.out.println("Loans are provided");
    }
    @Override
    public void interest() {

        System.out.println("Savings and intrested provided");
    }
    @Override
    public void atm() {

        System.out.println("ATM service");
    }

    public  void helpline(){
        System.out.println("Helpline are provided");
    }
}
