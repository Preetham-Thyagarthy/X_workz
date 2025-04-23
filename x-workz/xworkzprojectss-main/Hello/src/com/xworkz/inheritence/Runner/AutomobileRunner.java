package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.automobile.Automobile;
import com.xworkz.inheritence.internal.automobile.Car;
import com.xworkz.inheritence.internal.automobile.Wheel;

public class AutomobileRunner {
    public static void main(String[] args) {

        Automobile automobile = new Automobile();
        automobile.move();
        automobile.stop();
        automobile.fuel();
        automobile.speed();
        automobile.transport();

        System.out.println("**************************************");

        Automobile auto = new Car();
        auto.move();
        auto.stop();
        auto.fuel();
        auto.speed();
        auto.transport();

        System.out.println("**************************************");
        Car car=new Car();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();

        System.out.println("**************************************");

        Wheel wheel=new Wheel();
        wheel.run(automobile);
        wheel.run(auto);
        wheel.run(car);

    }
}
