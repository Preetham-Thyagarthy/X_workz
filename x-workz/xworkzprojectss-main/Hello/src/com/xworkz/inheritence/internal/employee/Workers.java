package com.xworkz.inheritence.internal.employee;

public class Workers {
    public void working(Employee employee) {
        employee.work();
        employee.salary();
        employee.benefits();
        employee.experience();
        employee.department();

        if (employee instanceof Manager) {
            System.out.println("Employee is an instance of Manager");
            Manager manager = (Manager) employee;
            manager.timings();
        }
    }
}
