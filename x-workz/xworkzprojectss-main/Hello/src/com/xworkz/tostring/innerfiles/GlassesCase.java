package com.xworkz.tostring.innerfiles;

public class GlassesCase {
    private int range;
    private String intensity;
    private double size;

    public GlassesCase(int range, String intensity, double size) {
        this.range = range;
        this.intensity = intensity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "GlassesCase [range=" + range + ", intensity=" + intensity + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 98710;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof GlassesCase) {
                System.out.println("Ref is glassescase,it will compare....");
                GlassesCase glassescase = this;
                GlassesCase glassescase1 = (GlassesCase) obj;
                if (glassescase.intensity.equals(glassescase1.intensity) && glassescase.size== glassescase1.size) {
                    System.out.println("Both glassescase are same");
                    return true;
                }
            }
        }
        return false;
    }
}
