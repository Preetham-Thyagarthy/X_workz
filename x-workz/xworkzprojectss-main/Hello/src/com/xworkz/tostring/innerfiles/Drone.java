package com.xworkz.tostring.innerfiles;

public class Drone {
    private int power;
    private String texture;
    private double capacity;

    public Drone(int power, String texture, double capacity) {
        this.power = power;
        this.texture = texture;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Drone [power=" + power + ", texture=" + texture + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 800102;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Drone) {
                System.out.println("Ref is drone,it will compare....");
                Drone drone = this;
                Drone drone1 = (Drone) obj;
                if (drone.texture.equals(drone1.texture)) {
                    System.out.println("Both drone are same");
                    return true;
                }
            }
        }
        return false;
    }
}
