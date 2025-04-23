package com.xworkz.tostring.innerfiles;

public class Sprinkler {
    private int shape;
    private String color;
    private double intensity;

    public Sprinkler(int shape, String color, double intensity) {
        this.shape = shape;
        this.color = color;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Sprinkler [shape=" + shape + ", shape=" + color + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 15202;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Sprinkler) {
                System.out.println("Ref is sprinkler,it will compare....");
                Sprinkler sprinkler = this;
                Sprinkler sprinkler1 = (Sprinkler) obj;
                if (sprinkler.intensity==sprinkler1.intensity && sprinkler.color.equals(sprinkler1.color) && sprinkler.shape== sprinkler1.shape) {
                    System.out.println("Both sprinkler are same");
                    return true;
                }
            }
        }
        return false;
    }
}
