package com.xworkz.tostring.innerfiles;

public class Modem {
    private int power;
    private String size;
    private double width;

    public Modem(int power, String size, double width) {
        this.power = power;
        this.size = size;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Modem [power=" + power + ", size=" + size + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 101;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Modem) {
                System.out.println("Ref is modem,it will compare....");
                Modem modem = this;
                Modem modem1 = (Modem) obj;
                if (modem.size.equals(modem1.size) && modem.power==modem1.power) {
                    System.out.println("Both modem are same");
                    return true;
                }
            }
        }
        return false;
    }
}
