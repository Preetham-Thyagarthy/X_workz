package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.motor.Motor;
import com.xworkz.inheritence.internal.motor.ElectricMotor;

public class MotorRunner {
    public static void main(String[] args) {


        Motor motor = new Motor();
        motor.usedForTransportation();
        motor.hasFourWheels();
        motor.poweredByEngine();
        motor.comesInVariousModels();
        motor.hasComfortFeatures();

        System.out.println("**************************************");
        Motor motors = new ElectricMotor();
        motors.usedForTransportation();
        motors.hasFourWheels();
        motors.poweredByEngine();
        motors.comesInVariousModels();
        motors.hasComfortFeatures();



        System.out.println("**************************************");
        ElectricMotor electricCar = new ElectricMotor();
        electricCar.usedForTransportation();
        electricCar.hasFourWheels();
        electricCar.poweredByEngine();
        electricCar.comesInVariousModels();
        electricCar.hasComfortFeatures();
    }
}
