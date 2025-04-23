package com.xworkz.tostring.innerfiles;

public class Vacuum {
    private int width;
    private String duration;
    private double capacity;

    public Vacuum(int width, String duration, double capacity) {
        this.width = width;
        this.duration = duration;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Vacuum [width=" + width + ", duration=" + duration + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 8967;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Vacuum) {
                System.out.println("Ref is vacuum,it will compare....");
                Vacuum vacuum = this;
                Vacuum vacuum1 = (Vacuum) obj;
                if (vacuum.width== vacuum1.width && vacuum.duration.equals(vacuum1.duration) && vacuum.capacity== vacuum1.capacity) {
                    System.out.println("Both vacuum are same");
                    return true;
                }
            }
        }
        return false;
    }
}
