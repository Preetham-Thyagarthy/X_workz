package com.xworkz.tostring.innerfiles;

public class Mop {
    private int brightness;
    private String thickness;
    private double volume;

    public Mop(int brightness, String thickness, double volume) {
        this.brightness = brightness;
        this.thickness = thickness;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Mop [brightness=" + brightness + ", thickness=" + thickness + ", volume=" + volume + "]";
    }
    @Override
    public int hashCode(){
        return 01;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Mop) {
                System.out.println("Ref is mop,it will compare....");
                Mop mop = this;
                Mop mop1 = (Mop) obj;
                if (mop.thickness.equals(mop1.thickness) && mop.volume== mop1.volume) {
                    System.out.println("Both mop are same");
                    return true;
                }
            }
        }
        return false;
    }
}
