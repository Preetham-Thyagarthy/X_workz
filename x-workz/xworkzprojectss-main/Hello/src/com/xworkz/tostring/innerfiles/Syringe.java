package com.xworkz.tostring.innerfiles;

public class Syringe {
    private int shape;
    private String width;
    private double range;

    public Syringe(int shape, String width, double range) {
        this.shape = shape;
        this.width = width;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Syringe [shape=" + shape + ", width=" + width + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 6567;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Syringe) {
                System.out.println("Ref is syringe,it will compare....");
                Syringe syringe = this;
                Syringe syringe1 = (Syringe) obj;
                if (syringe.shape== syringe1.shape && syringe.width.equals(syringe1.width) && syringe.range== syringe1.range) {
                    System.out.println("Both syringe are same");
                    return true;
                }
            }
        }
        return false;
    }
}
