package com.xworkz.tostring.innerfiles;

import javax.naming.Name;

public class Nail {
    private int width;
    private String intensity;
    private double power;

    public Nail(int width, String intensity, double power) {
        this.width = width;
        this.intensity = intensity;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Nail [width=" + width + ", intensity=" + intensity + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 52;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Nail) {
                System.out.println("Ref is nail,it will compare....");
                Nail nail = this;
                Nail nail1 = (Nail) obj;
                if (nail.intensity.equals(nail1.intensity) && nail.power==nail1.power) {
                    System.out.println("Both nail are same");
                    return true;
                }
            }
        }
        return false;
    }
}
