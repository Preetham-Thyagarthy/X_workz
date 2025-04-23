package com.xworkz.tostring.innerfiles;

public class Saxophone {
    private int color;
    private String brand;
    private double shape;

    public Saxophone(int color, String brand, double shape) {
        this.color = color;
        this.brand = brand;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Saxophone [color=" + color + ", color=" + brand + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 67890;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Saxophone) {
                System.out.println("Ref is saxophone,it will compare....");
                Saxophone saxophone = this;
                Saxophone saxophone1 = (Saxophone) obj;
                if (saxophone.color== saxophone1.color && saxophone.brand.equals(saxophone1.brand) && saxophone.shape== saxophone1.shape) {
                    System.out.println("Both saxophone are same");
                    return true;
                }
            }
        }
        return false;
    }
}
