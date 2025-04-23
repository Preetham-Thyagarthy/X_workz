package com.xworkz.tostring.innerfiles;

public class Wheelchair {
    private int speed;
    private String size;
    private double width;

    public Wheelchair(int speed, String size, double width) {
        this.speed = speed;
        this.size = size;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheelchair [speed=" + speed + ", size=" + size + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 867;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Wheelchair) {
                System.out.println("Ref is wheelchair,it will compare....");
                Wheelchair wheelchair = this;
                Wheelchair wheelchair1 = (Wheelchair) obj;
                if (wheelchair.speed==wheelchair1.speed && wheelchair.size.equals(wheelchair1.size) && wheelchair.width== wheelchair1.width) {
                    System.out.println("Both wheelchair are same");
                    return true;
                }
            }
        }
        return false;
    }
}

