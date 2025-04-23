package com.xworkz.tostring.innerfiles;

public class Hammer {
    private int material;
    private String shape;
    private double weight;

    public Hammer(int material, String shape, double weight) {
        this.material = material;
        this.shape = shape;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hammer [material=" + material + ", material=" + shape + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Hammer) {
                System.out.println("Ref is hammer,it will compare....");
                Hammer hammer = this;
                Hammer hammer1 = (Hammer) obj;
                if (hammer.shape.equals(hammer1.shape) && hammer.material== hammer1.material) {
                    System.out.println("Both hammer are same");
                    return true;
                }
            }
        }
        return false;
    }
}
