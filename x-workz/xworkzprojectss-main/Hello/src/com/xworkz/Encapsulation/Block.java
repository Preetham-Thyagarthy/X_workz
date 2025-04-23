package com.xworkz.Encapsulation;

    class Employee {
        static String companyName;  // Static variable
        int empId;
        String empName;

        // Static block: executes only once when the class is loaded
        static {
            companyName = "TCS";
        }

        // Constructor
        public Employee(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        // Method to display employee details
        void display() {
            System.out.println("Employee ID: " + empId + ", Name: " + empName + ", Company: " + companyName);
        }
    }

    // Main class
    public class Block {
        public static void main(String[] args) {
            Employee e1 = new Employee(01, "Ananya");
            Employee e2 = new Employee(02, "Dhanu");

            e1.display();
            e2.display();
        }
    }

