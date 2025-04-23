package com.xworkz.tostring.innerfiles;

public class Crayon {
    private int material;
    private String flexibility;
    private double power;

    public Crayon(int material, String flexibility, double power) {
        this.material = material;
        this.flexibility = flexibility;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Crayon [material=" + material + ", flexibility=" + flexibility + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 85897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Crayon) {
                System.out.println("Ref is crayon,it will compare....");
                Crayon crayon = this;
                Crayon crayon1 = (Crayon) obj;
                if (crayon.flexibility.equals(crayon1.flexibility)) {
                    System.out.println("Both crayon are same");
                    return true;
                }
            }
        }
        return false;
    }
}
