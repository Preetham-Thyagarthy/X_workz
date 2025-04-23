package com.xworkz.tostring.innerfiles;

public class Trombone {
    private int width;
    private String material;
    private double color;

    public Trombone(int width, String material, double color) {
        this.width = width;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Trombone [width=" + width + ", material=" + material + ", color=" + color + "]";
    }
    @Override
    public int hashCode(){
        return 3367;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Trombone) {
                System.out.println("Ref is trombone,it will compare....");
                Trombone trombone = this;
                Trombone trombone1 = (Trombone) obj;
                if (trombone.width== trombone1.width && trombone.material.equals(trombone1.material) && trombone.color== trombone1.color) {
                    System.out.println("Both trombone are same");
                    return true;
                }
            }
        }
        return false;
    }
}
