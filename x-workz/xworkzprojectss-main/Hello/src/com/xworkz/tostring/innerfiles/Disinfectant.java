package com.xworkz.tostring.innerfiles;

public class Disinfectant {
    private int capacity;
    private String width;
    private double intensity;

    public Disinfectant(int capacity, String width, double intensity) {
        this.capacity = capacity;
        this.width = width;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Disinfectant [capacity=" + capacity + ", width=" + width + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 6897;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Disinfectant) {
                System.out.println("Ref is disinfectant,it will compare....");
                Disinfectant disinfectant = this;
                Disinfectant disinfectant1 = (Disinfectant) obj;
                if (disinfectant.width.equals(disinfectant1.width)) {
                    System.out.println("Both disinfectant are same");
                    return true;
                }
            }
        }
        return false;
    }

}
