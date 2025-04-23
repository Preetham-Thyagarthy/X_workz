package com.xworkz.tostring.innerfiles;

public class Guitar {
    private int height;
    private String density;
    private double brightness;

    public Guitar(int height, String density, double brightness) {
        this.height = height;
        this.density = density;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Guitar [height=" + height + ", density=" + density + ", brightness=" + brightness + "]";
    }
    @Override
    public int hashCode(){
        return 7398;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Guitar) {
                System.out.println("Ref is guiter,it will compare....");
                Guitar guitar = this;
                Guitar guitar1 = (Guitar) obj;
                if (guitar.density.equals(guitar1.density) && guitar.brightness== guitar1.brightness) {
                    System.out.println("Both guiter are same");
                    return true;
                }
            }
        }
        return false;
    }
}
