package com.xworkz.tostring.innerfiles;

public class Hose {
    private int power;
    private String capacity;
    private double range;

    public Hose(int power, String capacity, double range) {
        this.power = power;
        this.capacity = capacity;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Hose [power=" + power + ", capacity=" + capacity + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 301;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Hose) {
                System.out.println("Ref is hose,it will compare....");
                Hose hose = this;
                Hose hose1 = (Hose) obj;
                if (hose.capacity.equals(hose1.capacity) && hose.power== hose1.power) {
                    System.out.println("Both hose are same");
                    return true;
                }
            }
        }
        return false;
    }
}
