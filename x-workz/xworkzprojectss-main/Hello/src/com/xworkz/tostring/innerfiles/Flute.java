package com.xworkz.tostring.innerfiles;

public class Flute {
    private int brightness;
    private String height;
    private double width;

    public Flute(int brightness, String height, double width) {
        this.brightness = brightness;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Flute [brightness=" + brightness + ", height=" + height + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 307;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Flute) {
                System.out.println("Ref is flute,it will compare....");
                Flute flute = this;
                Flute flute1 = (Flute) obj;
                if (flute.height.equals(flute1.height) && flute.width== flute1.width) {
                    System.out.println("Both flute are same");
                    return true;
                }
            }
        }
        return false;
    }
}
