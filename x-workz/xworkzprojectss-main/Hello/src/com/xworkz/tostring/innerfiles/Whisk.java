package com.xworkz.tostring.innerfiles;

public class Whisk {
    private int intensity;
    private String power;
    private double duration;

    public Whisk(int intensity, String power, double duration) {
        this.intensity = intensity;
        this.power = power;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Whisk [intensity=" + intensity + ", power=" + power + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 6887;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Whisk) {
                System.out.println("Ref is whisk,it will compare....");
                Whisk whisk = this;
                Whisk whisk1 = (Whisk) obj;
                if (whisk.power.equals(whisk1.power) && whisk.intensity== whisk1.intensity && whisk.duration== whisk1.duration) {
                    System.out.println("Both whisk are same");
                    return true;
                }
            }
        }
        return false;
    }
}
