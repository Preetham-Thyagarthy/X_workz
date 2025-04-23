package com.xworkz.tostring.innerfiles;

public class Telescope {
    private int width;
    private String material;
    private double intensity;

    public Telescope(int width, String material, double intensity) {
        this.width = width;
        this.material = material;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Telescope [width=" + width + ", material=" + material + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 7785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Telescope) {
                System.out.println("Ref is telescope,it will compare....");
                Telescope telescope = this;
                Telescope telescope1 = (Telescope) obj;
                if (telescope.width== telescope1.width && telescope.material.equals(telescope1.material) && telescope.intensity== telescope1.intensity) {
                    System.out.println("Both telescope are same");
                    return true;
                }
            }
        }
        return false;
    }
}
