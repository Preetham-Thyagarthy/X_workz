package com.xworkz.tostring.innerfiles;

public class Thermometer {
    private int power;
    private String texture;
    private double height;

    public Thermometer(int power, String texture, double height) {
        this.power = power;
        this.texture = texture;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Thermometer [power=" + power + ", texture=" + texture + ", height=" + height + "]";
    }
    @Override
    public int hashCode(){
        return 368;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Thermometer) {
                System.out.println("Ref is thermometer,it will compare....");
                Thermometer thermometer = this;
                Thermometer thermometer1 = (Thermometer) obj;
                if (thermometer.power== thermometer1.power && thermometer.texture.equals(thermometer1.texture) && thermometer.height== thermometer1.height) {
                    System.out.println("Both thermometer are same");
                    return true;
                }
            }
        }
        return false;
    }
}
