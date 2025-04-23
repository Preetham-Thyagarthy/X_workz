package com.xworkz.tostring.innerfiles;

public class Piano {
    private int duration;
    private String capacity;
    private double texture;

    public Piano(int duration, String capacity, double texture) {
        this.duration = duration;
        this.capacity = capacity;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Piano [duration=" + duration + ", capacity=" + capacity + ", texture=" + texture + "]";
    }
    @Override
    public int hashCode(){
        return 7801;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Piano) {
                System.out.println("Ref is piano,it will compare....");
                Piano piano = this;
                Piano piano1 = (Piano) obj;
                if (piano.capacity.equals(piano1.capacity) && piano.duration== piano1.duration) {
                    System.out.println("Both piano are same");
                    return true;
                }
            }
        }
        return false;
    }
}
