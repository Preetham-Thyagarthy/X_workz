package com.xworkz.tostring.innerfiles;

public class Trumpet {
    private int flexibility;
    private String brightness;
    private double density;

    public Trumpet(int flexibility, String brightness, double density) {
        this.flexibility = flexibility;
        this.brightness = brightness;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Trumpet [flexibility=" + flexibility + ", brightness=" + brightness + ", density=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 9637;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Trumpet) {
                System.out.println("Ref is trumpet,it will compare....");
                Trumpet trumpet = this;
                Trumpet trumpet1 = (Trumpet) obj;
                if (trumpet.flexibility== trumpet1.flexibility && trumpet.brightness.equals(trumpet1.brightness) && trumpet.density== trumpet1.density) {
                    System.out.println("Both trumpet are same");
                    return true;
                }
            }
        }
        return false;
    }
}
