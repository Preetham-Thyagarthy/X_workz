package com.xworkz.inheritence.internal.figure;

public class Rectangle {
    public void inspect(Figure figure) {
        figure.draw();
        figure.area();
        figure.perimeter();
        figure.color();
        figure.dimension();

        if (figure instanceof Circle) {
            System.out.println("Figure is an instance of Circle");
            Circle circle = (Circle) figure;
            circle.length();
        }
    }
}
