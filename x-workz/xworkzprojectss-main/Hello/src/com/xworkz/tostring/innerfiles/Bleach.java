package com.xworkz.tostring.innerfiles;

public class Bleach {
    private int color;
    private String flexibility;
    private double thickness;

    public Bleach(int color, String flexibility, double thickness) {
        this.color = color;
        this.flexibility = flexibility;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Bleach: color=" + color + ", flexibility=" + flexibility + ", thickness=" + thickness ;
    }
    @Override
    public int hashCode(){
        return 1870;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bleach) {
                System.out.println("Ref is bleach,it will compare....");
                Bleach bleach = this;
                Bleach bleach1 = (Bleach) obj;
                if (bleach.flexibility.equals(bleach1.flexibility)) {
                    System.out.println("Both bleach are same");
                    return true;
                }
            }
        }
        return false;
    }
}
