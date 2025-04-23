package com.xworkz.tostring.innerfiles;

public class Charcoal {
    private int intensity;
    private String texture;
    private double material;

    public Charcoal(int intensity, String texture, double material) {
        this.intensity = intensity;
        this.texture = texture;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Charcoal [intensity=" + intensity + ", texture=" + texture + ", material=" + material + "]";
    }
    @Override
    public int hashCode(){
        return 6997;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Charcoal) {
                System.out.println("Ref is charcoal,it will compare....");
                Charcoal charcoal = this;
                Charcoal charcoal1 = (Charcoal) obj;
                if (charcoal.texture.equals(charcoal1.texture)) {
                    System.out.println("Both charcoal are same");
                    return true;
                }
            }
        }
        return false;
    }
}
