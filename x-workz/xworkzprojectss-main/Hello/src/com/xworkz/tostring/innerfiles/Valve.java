package com.xworkz.tostring.innerfiles;

public class Valve {
    private int width;
    private String intensity;
    private double height;

    public Valve(int width, String intensity, double height) {
        this.width = width;
        this.intensity = intensity;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Valve [width=" + width + ", intensity=" + intensity + ", height=" + height + "]";
    }
    @Override
    public int hashCode(){
        return 79667;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Valve) {
                System.out.println("Ref is valve,it will compare....");
                Valve valve = this;
                Valve valve1 = (Valve) obj;
                if (valve.width== valve1.width && valve.intensity.equals(valve1.intensity) && valve.height== valve1.height) {
                    System.out.println("Both valve are same");
                    return true;
                }
            }
        }
        return false;
    }
}
