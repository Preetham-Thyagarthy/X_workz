package com.xworkz.tostring.innerfiles;

public class Cello {
    private int texture;
    private String speed;
    private double thickness;

    public Cello(int texture, String speed, double thickness) {
        this.texture = texture;
        this.speed = speed;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Cello [texture=" + texture + ", speed=" + speed + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 4897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Cello) {
                System.out.println("Ref is cello,it will compare....");
                Cello cello = this;
                Cello cello1 = (Cello) obj;
                if (cello.speed.equals(cello1.speed)) {
                    System.out.println("Both cello are same");
                    return true;
                }
            }
        }
        return false;
    }
}
