package com.xworkz.inheritence.internal.academy;

public class Harvard extends Academy {
    public Harvard() {
        super();
        System.out.println("Running non-arg constructor Harvard");
    }
    @Override
    public void education() {
        System.out.println("Education is good");
    }

    @Override
    public void research() {
        System.out.println("There are researches");
    }

    @Override
    public void students() {
        System.out.println("Students are more");
    }

    @Override
    public void faculty() {
        System.out.println("Faculties are helping");
    }

    @Override
    public void campus() {
        System.out.println("Campus is in large area");
    }

    public void activity(){
        System.out.println("Activities are done");
    }
}
