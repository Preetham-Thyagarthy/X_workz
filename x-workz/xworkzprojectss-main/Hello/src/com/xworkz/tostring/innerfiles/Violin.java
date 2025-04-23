package com.xworkz.tostring.innerfiles;

public class Violin {
    private int density;
    private String intensity;
    private double shape;

    public Violin(int density, String intensity, double shape) {
        this.density = density;
        this.intensity = intensity;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Violin [density=" + density + ", intensity=" + intensity + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 9567;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Violin) {
                System.out.println("Ref is violen,it will compare....");
                Violin violin = this;
                Violin violin1 = (Violin) obj;
                if (violin.intensity.equals(violin1.intensity) && violin.density== violin1.density && violin.shape== violin1.shape) {
                    System.out.println("Both violen are same");
                    return true;
                }
            }
        }
        return false;
    }
}
