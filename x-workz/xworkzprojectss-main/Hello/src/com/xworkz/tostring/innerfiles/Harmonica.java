package com.xworkz.tostring.innerfiles;

public class Harmonica {
    private int texture;
    private String capacity;
    private double thickness;

    public Harmonica(int texture, String capacity, double thickness) {
        this.texture = texture;
        this.capacity = capacity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Harmonica [texture=" + texture + ", capacity=" + capacity + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 60;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Harmonica) {
                System.out.println("Ref is harmonica,it will compare....");
                Harmonica harmonica = this;
                Harmonica harmonica1 = (Harmonica) obj;
                if (harmonica.capacity.equals(harmonica1.capacity) && harmonica.texture== harmonica1.texture) {
                    System.out.println("Both harmonica are same");
                    return true;
                }
            }
        }
        return false;
    }
}
