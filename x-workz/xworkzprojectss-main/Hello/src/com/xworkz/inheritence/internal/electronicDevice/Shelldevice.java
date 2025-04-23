package com.xworkz.inheritence.internal.electronicDevice;

public class Shelldevice {
    public void checkDevice(ElectronicDevice device) {
        device.powerOn();
        device.powerOff();
        device.battery();
        device.charge();

        if (device instanceof Mobile) {
            System.out.println("ElectronicDevice is an instance of Mobile");
            Mobile mobile = (Mobile) device;
            mobile.fetures();
        }
    }
}
