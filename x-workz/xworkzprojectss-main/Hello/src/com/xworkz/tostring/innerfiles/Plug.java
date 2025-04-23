package com.xworkz.tostring.innerfiles;

public class Plug {
    private int brightness;
    private String density;
    private double flexibility;

    public Plug(int brightness, String density, double flexibility) {
        this.brightness = brightness;
        this.density = density;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Plug [brightness=" + brightness + ", density=" + density + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 9023;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Plug) {
                System.out.println("Ref is plug,it will compare....");
                Plug plug = this;
                Plug plug1 = (Plug) obj;
                if (plug.density.equals(plug1.density) && plug.brightness==plug1.brightness) {
                    System.out.println("Both plug are same");
                    return true;
                }
            }
        }
        return false;
    }
}
