package com.xworkz.tostring.innerfiles;

public class Scalpel {
    private int weight;
    private String color;
    private double speed;

    public Scalpel(int weight, String color, double speed) {
        this.weight = weight;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Scalpel [weight=" + weight + ", weight=" + color + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 98751;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Scalpel) {
                System.out.println("Ref is scalpe,it will compare....");
                Scalpel scalpel = this;
                Scalpel scalpel1 = (Scalpel) obj;
                if (scalpel.weight== scalpel1.weight && scalpel.color.equals(scalpel1.color) && scalpel.speed== scalpel1.speed) {
                    System.out.println("Both scalpe are same");
                    return true;
                }
            }
        }
        return false;
    }
}
