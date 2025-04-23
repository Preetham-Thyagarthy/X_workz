package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.button.ElectricButton;
import com.xworkz.inheritence.internal.button.Button;
import com.xworkz.inheritence.internal.button.Keys;

public class ButtonRunner {
    public static void main(String[] args) {
        Button sw = new Button();
        sw.turnOn();
        sw.turnOff();
        sw.saveElectricity();
        sw.availableInVariousDesigns();
        sw.usedInHomes();

        System.out.println("**************************************");
        Button sw1 = new ElectricButton();
        sw1.turnOn();
        sw1.turnOff();
        sw1.saveElectricity();
        sw1.availableInVariousDesigns();
        sw1.usedInHomes();

        System.out.println("**************************************");
        ElectricButton electricSwitch = new ElectricButton();
        electricSwitch.turnOn();
        electricSwitch.turnOff();
        electricSwitch.saveElectricity();
        electricSwitch.availableInVariousDesigns();
        electricSwitch.usedInHomes();

        System.out.println("************Casting example**************");
        Keys keys=new Keys();
        keys.press(sw);
        keys.press(sw1);
        keys.press(electricSwitch);
    }
}
