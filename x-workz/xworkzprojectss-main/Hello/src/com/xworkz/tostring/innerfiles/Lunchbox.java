package com.xworkz.tostring.innerfiles;

public class Lunchbox {
    private int shape;
    private String material;
    private double quantity;

    public Lunchbox(int shape, String material, double quantity) {
        this.shape = shape;
        this.material = material;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Lunchbox [shape=" + shape + ", material=" + material + ", material=" + quantity + "]";
    }
    @Override
    public int hashCode(){
        return 10023;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Lunchbox) {
                System.out.println("Ref is lunchbox,it will compare....");
                Lunchbox lunchbox = this;
                Lunchbox lunchbox1 = (Lunchbox) obj;
                if (lunchbox.material.equals(lunchbox1.material) && lunchbox.shape== lunchbox1.shape) {
                    System.out.println("Both lunchbox are same");
                    return true;
                }
            }
        }
        return false;
    }
}
