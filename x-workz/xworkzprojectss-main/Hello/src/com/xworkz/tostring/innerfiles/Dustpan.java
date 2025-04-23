package com.xworkz.tostring.innerfiles;

public class Dustpan {
    private int volume;
    private String density;
    private double size;

    public Dustpan(int volume, String density, double size) {
        this.volume = volume;
        this.density = density;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dustpan [volume=" + volume + ", density=" + density + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 75903;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Dustpan) {
                System.out.println("Ref is dustpan,it will compare....");
                Dustpan dustpan = this;
                Dustpan dustpan1 = (Dustpan) obj;
                if (dustpan.density.equals(dustpan1.density)) {
                    System.out.println("Both dustpan are same");
                    return true;
                }
            }
        }
        return false;
    }
}
