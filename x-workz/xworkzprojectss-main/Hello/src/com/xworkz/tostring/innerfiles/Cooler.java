package com.xworkz.tostring.innerfiles;

public class Cooler {
    private int material;
    private String weight;
    private double power;

    public Cooler(int material, String weight, double power) {
        this.material = material;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Cooler [material=" + material + ", weight=" + weight + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 45897;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Cooler) {
                System.out.println("Ref is cooler,it will compare....");
                Cooler cooler = this;
                Cooler cooler1 = (Cooler) obj;
                if (cooler.weight.equals(cooler1.weight)) {
                    System.out.println("Both cooler are same");
                    return true;
                }
            }
        }
        return false;
    }
}
