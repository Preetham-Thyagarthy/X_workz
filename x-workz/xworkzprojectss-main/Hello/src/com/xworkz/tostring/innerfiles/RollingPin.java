package com.xworkz.tostring.innerfiles;

public class RollingPin {
    private int size;
    private String speed;
    private double power;

    public RollingPin(int size, String speed, double power) {
        this.size = size;
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "RollingPin [size=" + size + ", speed=" + speed + ", power=" + power + "]";
    }

    @Override
    public int hashCode(){
        return 459;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof RollingPin) {
                System.out.println("Ref is rollingpin,it will compare....");
                RollingPin rollingpin = this;
                RollingPin rollingpin1 = (RollingPin) obj;
                if (rollingpin.speed.equals(rollingpin1.speed) && rollingpin.size== rollingpin1.size && rollingpin.power== rollingpin1.power) {
                    System.out.println("Both rollingpin are same");
                    return true;
                }
            }
        }
        return false;
    }
}
