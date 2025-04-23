package com.xworkz.tostring.innerfiles;

public class Sketchpad {
    private int material;
    private String size;
    private double weight;

    public Sketchpad(int material, String size, double weight) {
        this.material = material;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sketchpad [material=" + material + ", size=" + size + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3698745;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Sketchpad) {
                System.out.println("Ref is sketchpad,it will compare....");
                Sketchpad sketchpad = this;
                Sketchpad sketchpad1 = (Sketchpad) obj;
                if (sketchpad.material== sketchpad1.material && sketchpad.size.equals(sketchpad1.size) && sketchpad.weight== sketchpad1.weight) {
                    System.out.println("Both sketchpad are same");
                    return true;
                }
            }
        }
        return false;
    }
}
