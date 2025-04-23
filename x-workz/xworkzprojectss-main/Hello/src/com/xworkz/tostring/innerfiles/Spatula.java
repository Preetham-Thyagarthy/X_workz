package com.xworkz.tostring.innerfiles;

public class Spatula {
    private int shape;
    private String size;
    private double speed;

    public Spatula(int shape, String size, double speed) {
        this.shape = shape;
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Spatula [shape=" + shape + ", size=" + size + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 9875;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Spatula) {
                System.out.println("Ref is spatula,it will compare....");
                Spatula spatula = this;
                Spatula spatula1 = (Spatula) obj;
                if (spatula.speed== spatula1.speed && spatula.size.equals(spatula1.size) && spatula.speed== spatula1.speed) {
                    System.out.println("Both spatula are same");
                    return true;
                }
            }
        }
        return false;
    }
}
