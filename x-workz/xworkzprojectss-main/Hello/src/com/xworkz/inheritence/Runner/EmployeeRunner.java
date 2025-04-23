package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.employee.Employee;
import com.xworkz.inheritence.internal.employee.Manager;
import com.xworkz.inheritence.internal.employee.Workers;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();
        System.out.println("**************************************");
        Employee emply = new Manager();
        emply.work();
        emply.salary();
        emply.benefits();
        emply.experience();
        emply.department();


        System.out.println("**************************************");
        Manager manager=new Manager();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();

        System.out.println("************Casting example**************");
        Workers workers=new Workers();
        workers.working(emp);
        workers.working(emply);
        workers.working(manager);
    }
}
