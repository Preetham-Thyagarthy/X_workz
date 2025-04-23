package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bank.Bank;
import com.xworkz.inheritence.internal.bank.HDFCBank;
import com.xworkz.inheritence.internal.bank.Loan;

public class BankRunner {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interest();
        bank.atm();

        System.out.println("**************************************");

        Bank bank1 = new HDFCBank();
        bank1.deposit();
        bank1.withdraw();
        bank1.loan();
        bank1.interest();
        bank1.atm();

        System.out.println("**************************************");
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.deposit();
        hdfcBank.withdraw();
        hdfcBank.loan();
        hdfcBank.interest();
        hdfcBank.atm();

        System.out.println("************Casting example**************");
        Loan loan=new Loan();
        loan.provideLoan(bank);
        loan.provideLoan(bank1);
        loan.provideLoan(hdfcBank);
    }
}
