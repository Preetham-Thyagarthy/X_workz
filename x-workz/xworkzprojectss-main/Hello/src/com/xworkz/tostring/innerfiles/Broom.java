package com.xworkz.tostring.innerfiles;

public class Broom {
    private int color;
    private String density;
    private double shape;

    public Broom(int color, String density, double shape) {
        this.color = color;
        this.density = density;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Broom: color=" + color + ", density=" + density + ", shape=" + shape ;
    }
    @Override
    public int hashCode(){
        return 600;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Broom) {
                System.out.println("Ref is broom,it will compare....");
                Broom broom = this;
                Broom broom1 = (Broom) obj;
                if (broom.density.equals(broom1.density)) {
                    System.out.println("Both broom are same");
                    return true;
                }
            }
        }
        return false;
    }
}
