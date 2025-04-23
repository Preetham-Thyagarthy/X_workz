package com.xworkz.tostring.innerfiles;

public class Thermos {
    private int speed;
    private String volume;
    private double shape;

    public Thermos(int speed, String volume, double shape) {
        this.speed = speed;
        this.volume = volume;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Thermos [speed=" + speed + ", volume=" + volume + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 98537;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Thermos) {
                System.out.println("Ref is thermos,it will compare....");
                Thermos thermos = this;
                Thermos thermos1 = (Thermos) obj;
                if (thermos.shape== thermos1.shape && thermos.volume.equals(thermos1.volume) && thermos.speed== thermos1.speed) {
                    System.out.println("Both thermos are same");
                    return true;
                }
            }
        }
        return false;
    }
}
