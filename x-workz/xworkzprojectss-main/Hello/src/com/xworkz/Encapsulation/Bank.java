package com.xworkz.Encapsulation;

    class Bankacc {
        private String Accountholder;
        private double balance;

        // Constructor
        public Bankacc(String accountHolder, double balance) {
            this.Accountholder = Accountholder;
            this.balance = balance;
        }

        // Getter method to access private variable
        public double getBalance() {
            return balance;
        }

        // Setter method to update balance
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }
    }

    // Main class
    public class Bank {
        public static void main(String[] args) {
            Bankacc account = new Bankacc("Ananya", 500);

            // Accessing balance using getter
            System.out.println("Current Balance: " + account.getBalance());

            // Depositing amount using setter method
            account.deposit(2000);
            System.out.println("Updated Balance: " + account.getBalance());
        }
    }

