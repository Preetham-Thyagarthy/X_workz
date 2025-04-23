package com.xworkz.inheritence.internal.figure;

public class Circle extends Figure {
    public Circle() {
        super();
        System.out.println("Running non-arg constructor Circle");
    }
    @Override
    public void draw() {
        System.out.println("Figure is drawed");
    }
    @Override
    public void area() {
        System.out.println("Area of figure");
    }
    @Override
    public void perimeter() {
        System.out.println("Perimeter of figure");
    }
    @Override
    public void color() {
        System.out.println("Have different colors");
    }
    @Override
    public void dimension() {
        System.out.println("Have dimensions");
    }
    public void length(){
        System.out.println("This will have length and bredth");
    }
}
