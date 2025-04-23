package com.xworkz.tostring.innerfiles;

public class Flashlight {
    private int weight;
    private String intensity;
    private double density;

    public Flashlight(int weight, String intensity, double density) {
        this.weight = weight;
        this.intensity = intensity;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Flashlight [weight=" + weight + ", intensity=" + intensity + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 107;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Flashlight) {
                System.out.println("Ref is flashlight,it will compare....");
                Flashlight flashlight = this;
                Flashlight flashlight1 = (Flashlight) obj;
                if (flashlight.intensity.equals(flashlight1.intensity) && flashlight.density== flashlight1.density) {
                    System.out.println("Both flashlight are same");
                    return true;
                }
            }
        }
        return false;
    }
}
