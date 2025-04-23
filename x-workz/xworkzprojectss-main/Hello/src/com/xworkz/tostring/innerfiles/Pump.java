package com.xworkz.tostring.innerfiles;

public class Pump {
    private int texture;
    private String height;
    private double capacity;

    public Pump(int texture, String height, double capacity) {
        this.texture = texture;
        this.height = height;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Pump [texture=" + texture + ", height=" + height + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 89902;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Pump) {
                System.out.println("Ref is pump,it will compare....");
                Pump pump = this;
                Pump pump1 = (Pump) obj;
                if (pump.height.equals(pump1.height) && pump.texture== pump1.texture && pump.capacity== pump1.capacity) {
                    System.out.println("Both pump are same");
                    return true;
                }
            }
        }
        return false;
    }
}
