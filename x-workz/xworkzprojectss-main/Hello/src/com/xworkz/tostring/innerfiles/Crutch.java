package com.xworkz.tostring.innerfiles;

public class Crutch {
    private int weight;
    private String density;
    private double material;

    public Crutch(int weight, String density, double material) {
        this.weight = weight;
        this.density = density;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Crutch [weight=" + weight + ", density=" + density + ", material=" + material + "]";
    }
    @Override
    public int hashCode(){
        return 35897;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Crutch) {
                System.out.println("Ref is crutch,it will compare....");
                Crutch crutch = this;
                Crutch crutch1 = (Crutch) obj;
                if (crutch.density.equals(crutch1.density)) {
                    System.out.println("Both crutch are same");
                    return true;
                }
            }
        }
        return false;
    }
}



