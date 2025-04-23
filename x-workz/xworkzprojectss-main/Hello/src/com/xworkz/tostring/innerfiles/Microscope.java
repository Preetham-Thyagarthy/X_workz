package com.xworkz.tostring.innerfiles;

public class Microscope {
    private int range;
    private String width;
    private double density;

    public Microscope(int range, String width, double density) {
        this.range = range;
        this.width = width;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Microscope [range=" + range + ", width=" + width + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 900;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Microscope) {
                System.out.println("Ref is microscope,it will compare....");
                Microscope microscope = this;
                Microscope microscope1 = (Microscope) obj;
                if (microscope.width.equals(microscope1.width) && microscope.range== microscope1.range) {
                    System.out.println("Both microscope are same");
                    return true;
                }
            }
        }
        return false;
    }
}
