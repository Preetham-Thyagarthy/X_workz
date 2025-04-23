package com.xworkz.tostring.innerfiles;

public class Umbrella {
    private int height;
    private String duration;
    private double size;

    public Umbrella(int height, String duration, double size) {
        this.height = height;
        this.duration = duration;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Umbrella [height=" + height + ", duration=" + duration + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 9757;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Umbrella) {
                System.out.println("Ref is umbrella,it will compare....");
                Umbrella umbrella = this;
                Umbrella umbrella1 = (Umbrella) obj;
                if (umbrella.height== umbrella1.height && umbrella.duration.equals(umbrella1.duration) && umbrella.size== umbrella1.size) {
                    System.out.println("Both umbrella are same");
                    return true;
                }
            }
        }
        return false;
    }
}
