package com.xworkz.inheritence.internal.automobile;

public class Wheel {
    public void run(Automobile automobile) {
        automobile.move();
        automobile.stop();
        automobile.fuel();
        automobile.speed();
        automobile.transport();

        if (automobile instanceof Car) {
            System.out.println("Automobile is an instance of Car");
            Car car = (Car) automobile;
            car.distance();
        }
    }
}
