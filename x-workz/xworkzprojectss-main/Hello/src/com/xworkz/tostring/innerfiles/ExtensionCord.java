package com.xworkz.tostring.innerfiles;

public class ExtensionCord {
    private int height;
    private String thickness;
    private double density;

    public ExtensionCord(int height, String thickness, double density) {
        this.height = height;
        this.thickness = thickness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "ExtensionCord [height=" + height + ", thickness=" + thickness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 90020;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof ExtensionCord) {
                System.out.println("Ref is extensioncord,it will compare....");
                ExtensionCord extensioncord = this;
                ExtensionCord extensioncord1 = (ExtensionCord) obj;
                if (extensioncord.thickness.equals(extensioncord1.thickness) && extensioncord.density== extensioncord1.density) {
                    System.out.println("Both extensioncord are same");
                    return true;
                }
            }
        }
        return false;
    }
}
