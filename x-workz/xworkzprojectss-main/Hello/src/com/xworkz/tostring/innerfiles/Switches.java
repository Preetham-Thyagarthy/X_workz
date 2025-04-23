package com.xworkz.tostring.innerfiles;

public class Switches {
    private int color;
    private String volume;
    private double thickness;

    public Switches(int color, String volume, double thickness) {
        this.color = color;
        this.volume = volume;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Switch [color=" + color + ", volume=" + volume + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 7567;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Switches) {
                System.out.println("Ref is envelope,it will compare....");
                Switches switches = this;
                Switches switches1 = (Switches) obj;
                if ( switches.volume.equals(switches1.volume) && switches.color== switches1.color) {
                    System.out.println("Both envelope are same");
                    return true;
                }
            }
        }
        return false;
    }
}
