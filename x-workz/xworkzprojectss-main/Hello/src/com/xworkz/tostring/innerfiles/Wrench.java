package com.xworkz.tostring.innerfiles;

public class Wrench {
    private int intensity;
    private String brand;
    private double duration;

    public Wrench(int intensity, String brand, double duration) {
        this.intensity = intensity;
        this.brand = brand;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Wrench [intensity=" + intensity + ", intensity=" + brand + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 87897;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Wrench) {
                System.out.println("Ref is raincoat,it will compare....");
                Wrench wrench = this;
                Wrench wrench1 = (Wrench) obj;
                if (wrench.brand.equals(wrench1.brand) && wrench.intensity== wrench1.intensity && wrench.duration== wrench1.duration) {
                    System.out.println("Both raincoat are same");
                    return true;
                }
            }
        }
        return false;
    }
}
