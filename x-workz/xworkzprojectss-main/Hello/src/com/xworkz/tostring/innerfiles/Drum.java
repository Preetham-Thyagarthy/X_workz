package com.xworkz.tostring.innerfiles;

public class Drum {
    private int weight;
    private String capacity;
    private double thickness;

    public Drum(int weight, String capacity, double thickness) {
        this.weight = weight;
        this.capacity = capacity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Drum [weight=" + weight + ", capacity=" + capacity + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 30020;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Drum) {
                System.out.println("Ref is drum,it will compare....");
                Drum drum = this;
                Drum drum1 = (Drum) obj;
                if (drum.capacity.equals(drum1.capacity)) {
                    System.out.println("Both drum are same");
                    return true;
                }
            }
        }
        return false;
    }
}
