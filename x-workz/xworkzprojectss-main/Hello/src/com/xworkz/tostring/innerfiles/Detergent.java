package com.xworkz.tostring.innerfiles;

public class Detergent {
    private int capacity;
    private String brightness;
    private double flexibility;

    public Detergent(int capacity, String brightness, double flexibility) {
        this.capacity = capacity;
        this.brightness = brightness;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Detergent [capacity=" + capacity + ", brightness=" + brightness + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 4597;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Detergent) {
                System.out.println("Ref is detergent,it will compare....");
                Detergent detergent = this;
                Detergent detergent1 = (Detergent) obj;
                if (detergent.brightness.equals(detergent1.brightness)) {
                    System.out.println("Both detergent are same");
                    return true;
                }
            }
        }
        return false;
    }
}
