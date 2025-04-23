package com.xworkz.inheritence.internal.button;

public class Keys {
    public void press(Button button) {
        button.turnOn();
        button.turnOff();
        button.saveElectricity();
        button.availableInVariousDesigns();
        button.usedInHomes();

        if (button instanceof ElectricButton) {
            System.out.println("Button is an instance of ElectricButton");
            ElectricButton electricButton = (ElectricButton) button;
            electricButton.tvremote();
        }
    }
}
