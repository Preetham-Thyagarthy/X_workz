package com.xworkz.tostring.innerfiles;

public class Envelope {
    private int speed;
    private String intensity;
    private double thickness;

    public Envelope(int speed, String intensity, double thickness) {
        this.speed = speed;
        this.intensity = intensity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Envelope [speed=" + speed + ", intensity=" + intensity + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 801023;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Envelope) {
                System.out.println("Ref is envelope,it will compare....");
                Envelope envelope = this;
                Envelope envelope1 = (Envelope) obj;
                if ( envelope.intensity.equals(envelope1.intensity) && envelope.speed==envelope1.speed) {
                    System.out.println("Both envelope are same");
                    return true;
                }
            }
        }
        return false;
    }
}
