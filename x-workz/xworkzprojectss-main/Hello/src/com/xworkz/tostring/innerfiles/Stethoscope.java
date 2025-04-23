package com.xworkz.tostring.innerfiles;

public class Stethoscope {
    private int color;
    private String flexibility;
    private double shape;

    public Stethoscope(int color, String flexibility, double shape) {
        this.color = color;
        this.flexibility = flexibility;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Stethoscope [color=" + color + ", flexibility=" + flexibility + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 90030;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Stethoscope) {
                System.out.println("Ref is stethoscope,it will compare....");
                Stethoscope stethoscope = this;
                Stethoscope stethoscope1 = (Stethoscope) obj;
                if (stethoscope.flexibility.equals(stethoscope1.flexibility) && stethoscope.color== stethoscope1.color && stethoscope.shape== stethoscope1.shape) {
                    System.out.println("Both stethoscope are same");
                    return true;
                }
            }
        }
        return false;
    }
}
