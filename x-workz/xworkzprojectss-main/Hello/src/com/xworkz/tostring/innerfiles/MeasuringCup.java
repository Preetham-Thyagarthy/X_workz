package com.xworkz.tostring.innerfiles;

public class MeasuringCup {
    private int intensity;
    private String duration;
    private double speed;

    public MeasuringCup(int intensity, String duration, double speed) {
        this.intensity = intensity;
        this.duration = duration;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "MeasuringCup [intensity=" + intensity + ", duration=" + duration + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 960;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof MeasuringCup) {
                System.out.println("Ref is measuringcup,it will compare....");
                MeasuringCup measuringcup = this;
                MeasuringCup measuringcup1 = (MeasuringCup) obj;
                if (measuringcup.duration.equals(measuringcup1.duration) && measuringcup.intensity== measuringcup1.intensity) {
                    System.out.println("Both measuring cup are same");
                    return true;
                }
            }
        }
        return false;
    }
}
