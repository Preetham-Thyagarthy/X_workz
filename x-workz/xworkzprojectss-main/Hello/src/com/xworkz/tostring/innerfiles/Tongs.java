package com.xworkz.tostring.innerfiles;

public class Tongs {
    private int weight;
    private String flexibility;
    private double power;

    public Tongs(int weight, String flexibility, double power) {
        this.weight = weight;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Tongs [weight=" + weight + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 9999;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Tongs) {
                System.out.println("Ref is tongs,it will compare....");
                Tongs tongs = this;
                Tongs tongs1 = (Tongs) obj;
                if (tongs.weight== tongs1.weight && tongs.flexibility.equals(tongs1.flexibility) && tongs.power== tongs1.power) {
                    System.out.println("Both tongs are same");
                    return true;
                }
            }
        }
        return false;
    }
}
