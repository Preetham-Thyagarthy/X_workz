package com.xworkz.tostring.innerfiles;

public class Drill {
    private int material;
    private String intensity;
    private double brightness;

    public Drill(int material, String intensity, double brightness) {
        this.material = material;
        this.intensity = intensity;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Drill [material=" + material + ", intensity=" + intensity + ", brightness=" + brightness + "]";
    }
    @Override
    public int hashCode(){
        return 9597;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Drill) {
                System.out.println("Ref is drill,it will compare....");
                Drill drill = this;
                Drill drill1 = (Drill) obj;
                if (drill.intensity.equals(drill1.intensity)) {
                    System.out.println("Both drill are same");
                    return true;
                }
            }
        }
        return false;
    }
}
