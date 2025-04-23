package com.xworkz.inheritence.internal.bank;

public class Loan {
    public void provideLoan(Bank bank) {
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interest();
        bank.atm();

        if (bank instanceof HDFCBank) {
            System.out.println("Bank is an instance of HDFCBank");
            HDFCBank hdfc = (HDFCBank) bank;
            hdfc.helpline();
        }
    }
}
