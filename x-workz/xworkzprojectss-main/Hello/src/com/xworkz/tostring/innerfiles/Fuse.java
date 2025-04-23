package com.xworkz.tostring.innerfiles;

public class Fuse {
    private int thickness;
    private String color;
    private double brightness;

    public Fuse(int thickness, String color, double brightness) {
        this.thickness = thickness;
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Fuse [thickness=" + thickness + ", color=" + color + ", brightness=" + brightness + "]";
    }
    @Override
    public int hashCode(){
        return 267;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Fuse) {
                System.out.println("Ref is fuse,it will compare....");
                Fuse fuse = this;
                Fuse fuse1 = (Fuse) obj;
                if (fuse.color.equals(fuse1.color) && fuse.thickness== fuse1.thickness) {
                    System.out.println("Both fuse are same");
                    return true;
                }
            }
        }
        return false;
    }
}
