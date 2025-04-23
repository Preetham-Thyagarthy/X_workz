package com.xworkz.inheritence.internal.figure;

public class Figure {
    public Figure() {
        System.out.println("Running non-arg constructor Figure");
    }
    public void draw() {
        System.out.println("Drawing a figure");
    }
    public void area() {
        System.out.println("Calculating area of figure");
    }
    public void perimeter() {
        System.out.println("Calculating perimeter of figure");
    }
    public void color() {
        System.out.println("Figures can have different colors");
    }
    public void dimension() {
        System.out.println("Figures have dimensions");
    }
}
