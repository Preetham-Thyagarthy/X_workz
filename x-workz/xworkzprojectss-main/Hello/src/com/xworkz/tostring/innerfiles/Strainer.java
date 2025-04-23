package com.xworkz.tostring.innerfiles;

public class Strainer {
    private int thickness;
    private String material;
    private double capacity;

    public Strainer(int thickness, String material, double capacity) {
        this.thickness = thickness;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Strainer [thickness=" + thickness + ", material=" + material + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 60507;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Strainer) {
                System.out.println("Ref is strainer,it will compare....");
                Strainer strainer = this;
                Strainer strainer1 = (Strainer) obj;
                if (strainer.material.equals(strainer1.material) && strainer.thickness== strainer1.thickness && strainer.capacity== strainer1.capacity) {
                    System.out.println("Both strainer are same");
                    return true;
                }
            }
        }
        return false;
    }
}
