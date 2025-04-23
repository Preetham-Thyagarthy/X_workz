package com.xworkz.tostring.innerfiles;

public class Raincoat {
    private int size;
    private String speed;
    private double flexibility;

    public Raincoat(int size, String speed, double flexibility) {
        this.size = size;
        this.speed = speed;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Raincoat [size=" + size + ", speed=" + speed + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 102;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Raincoat) {
                System.out.println("Ref is raincoat,it will compare....");
                Raincoat raincoat = this;
                Raincoat raincoat1 = (Raincoat) obj;
                if (raincoat.speed.equals(raincoat1.speed) && raincoat.size== raincoat1.size && raincoat.flexibility== raincoat1.flexibility) {
                    System.out.println("Both raincoat are same");
                    return true;
                }
            }
        }
        return false;
    }
}
