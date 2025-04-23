package com.xworkz.tostring.innerfiles;

public class Pliers {
    private int speed;
    private String flexibility;
    private double power;

    public Pliers(int speed, String flexibility, double power) {
        this.speed = speed;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Pliers [speed=" + speed + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 802;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Pliers) {
                System.out.println("Ref is pliers,it will compare....");
                Pliers pliers = this;
                Pliers pliers1 = (Pliers) obj;
                if (pliers.flexibility.equals(pliers1.flexibility) && pliers.power== pliers1.power) {
                    System.out.println("Both pliers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
