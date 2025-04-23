package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.figure.Figure;
import com.xworkz.inheritence.internal.figure.Circle;
import com.xworkz.inheritence.internal.figure.Rectangle;

public class FigureRunner {
    public static void main(String[] args) {

        Figure figure = new Figure();
        figure.draw();
        figure.area();
        figure.perimeter();
        figure.color();
        figure.dimension();
        System.out.println("**************************************");

        Figure figure1 = new Circle();
        figure1.draw();
        figure1.area();
        figure1.perimeter();
        figure1.color();
        figure1.dimension();

        System.out.println("**************************************");
        Circle circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.dimension();

        System.out.println("************Casting example**************");
        Rectangle rectangle=new Rectangle();
        rectangle.inspect(figure);
        rectangle.inspect(figure1);
        rectangle.inspect(circle);
    }
}
