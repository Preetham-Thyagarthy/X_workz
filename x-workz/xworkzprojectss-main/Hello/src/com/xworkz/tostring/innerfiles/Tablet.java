package com.xworkz.tostring.innerfiles;

public class Tablet {
    private int price;
    private String color;
    private double weight;

    public Tablet(int price, String color, double weight) {
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tablet [color=" + price + ", color=" + color + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 895667;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Tablet) {
                System.out.println("Ref is tablet,it will compare....");
                Tablet tablet = this;
                Tablet tablet1 = (Tablet) obj;
                if (tablet.price== tablet1.price && tablet.color.equals(tablet1.color) && tablet.weight== tablet1.weight) {
                    System.out.println("Both tablet are same");
                    return true;
                }
            }
        }
        return false;
    }
}
