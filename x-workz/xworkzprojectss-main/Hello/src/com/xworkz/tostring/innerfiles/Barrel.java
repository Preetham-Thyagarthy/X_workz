package com.xworkz.tostring.innerfiles;

public class Barrel {
    private int weight;
    private String power;
    private double capacity;

    public Barrel(int weight, String power, double capacity) {
        this.weight = weight;
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Barrel: weight=" + weight + ", power=" + power + ", capacity=" + capacity ;
    }
    @Override
    public int hashCode(){
        return 790;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Barrel) {
                System.out.println("Ref is broom,it will compare....");
                Barrel barrel = this;
                Barrel barrel1 = (Barrel) obj;
                if (barrel.power.equals(barrel1.power)) {
                    System.out.println("Both broom are same");
                    return true;
                }
            }
        }
        return false;
    }
}
