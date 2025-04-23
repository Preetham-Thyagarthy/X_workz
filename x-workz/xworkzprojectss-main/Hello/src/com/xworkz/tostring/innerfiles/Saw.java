package com.xworkz.tostring.innerfiles;

public class Saw {
    private int size;
    private String range;
    private double distance;

    public Saw(int size, String range, double distance) {
        this.size = size;
        this.range = range;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Saw [size=" + size + ", range=" + range + ", range=" + distance + "]";
    }

    @Override
    public int hashCode(){
        return 638;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Saw) {
                System.out.println("Ref is saw,it will compare....");
                Saw saw = this;
                Saw saw1 = (Saw) obj;
                if (saw.range.equals(saw1.range) && saw.size== saw1.size && saw.distance== saw1.distance) {
                    System.out.println("Both saw are same");
                    return true;
                }
            }
        }
        return false;
    }
}
