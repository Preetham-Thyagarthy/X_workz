package com.xworkz.inheritence.internal.employee;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Running non-arg constructor Manager");
    }
    @Override
    public void work() {
        System.out.println("Working employee");
    }
    @Override
    public void salary() {
        System.out.println("Gets salary");
    }
    @Override
    public void benefits() {
        System.out.println("Gets benefits");
    }
    @Override
    public void experience() {
        System.out.println("Gains experience");
    }
    @Override
    public void department() {
        System.out.println("Belongs to a department");
    }
    public void timings(){
        System.out.println("The workers work from day to night");
    }
}
