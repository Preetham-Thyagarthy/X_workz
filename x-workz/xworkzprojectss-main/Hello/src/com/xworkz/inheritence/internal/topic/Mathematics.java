package com.xworkz.inheritence.internal.topic;

public class Mathematics extends Topic {
    public Mathematics() {
        super();
        System.out.println("Running non-arg constructor of Mathematics");
    }
    @Override
    public void study() {
        System.out.println("Requires study");
    }
    @Override
    public void exam() {
        System.out.println("Tested in exams");
    }
    @Override
    public void difficulty() {
        System.out.println("Can be difficult");
    }
    @Override
    public void syllabus() {
        System.out.println("Has a syllabus");
    }
}
