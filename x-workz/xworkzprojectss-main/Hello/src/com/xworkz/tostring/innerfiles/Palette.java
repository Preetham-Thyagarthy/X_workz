package com.xworkz.tostring.innerfiles;

public class Palette {
    private int speed;
    private String width;
    private double volume;

    public Palette(int speed, String width, double volume) {
        this.speed = speed;
        this.width = width;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Palette [speed=" + speed + ", width=" + width + ", volume=" + volume + "]";
    }
    @Override
    public int hashCode(){
        return 410;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Palette) {
                System.out.println("Ref is palette,it will compare....");
                Palette palette = this;
                Palette palette1 = (Palette) obj;
                if (palette.width.equals(palette1.width) && palette.speed== palette1.speed) {
                    System.out.println("Both palette are same");
                    return true;
                }
            }
        }
        return false;
    }
}
