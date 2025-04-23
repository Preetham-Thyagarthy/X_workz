package com.xworkz.tostring.innerfiles;

public class Easel {
    private int volume;
    private String color;
    private double size;

    public Easel(int volume, String color, double size) {
        this.volume = volume;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Easel [volume=" + volume + ", color=" + color + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 90103;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Easel) {
                System.out.println("Ref is easel,it will compare....");
                Easel easel = this;
                Easel easel1 = (Easel) obj;
                if (easel.color.equals(easel1.color)) {
                    System.out.println("Both easel are same");
                    return true;
                }
            }
        }
        return false;
    }
}
