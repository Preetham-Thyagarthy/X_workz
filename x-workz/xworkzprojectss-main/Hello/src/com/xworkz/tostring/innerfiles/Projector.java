package com.xworkz.tostring.innerfiles;

public class Projector {
    private int thickness;
    private String density;
    private double range;

    public Projector(int thickness, String density, double range) {
        this.thickness = thickness;
        this.density = density;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Projector [thickness=" + thickness + ", density=" + density + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 102;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Projector) {
                System.out.println("Ref is projector,it will compare....");
                Projector projector = this;
                Projector projector1 = (Projector) obj;
                if (projector.density.equals(projector1.density) && projector.thickness==projector1.thickness && projector.range==projector1.range) {
                    System.out.println("Both project are same");
                    return true;
                }
            }
        }
        return false;
    }
}
