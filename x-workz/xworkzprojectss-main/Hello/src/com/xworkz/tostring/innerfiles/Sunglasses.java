package com.xworkz.tostring.innerfiles;

public class Sunglasses {
    private int capacity;
    private String brightness;
    private double density;

    public Sunglasses(int capacity, String brightness, double density) {
        this.capacity = capacity;
        this.brightness = brightness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Sunglasses [capacity=" + capacity + ", brightness=" + brightness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 8907;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Sunglasses) {
                System.out.println("Ref is sunglasses,it will compare....");
                Sunglasses sunglasses = this;
                Sunglasses sunglasses1 = (Sunglasses) obj;
                if (sunglasses.brightness.equals(sunglasses1.brightness) && sunglasses.capacity== sunglasses1.capacity && sunglasses.density== sunglasses1.density) {
                    System.out.println("Both sunglasses are same");
                    return true;
                }
            }
        }
        return false;
    }
}
