package com.xworkz.tostring.innerfiles;

public class Bandage {
    private int flexibility;
    private String shape;
    private double weight;

   /* public Bandage(int flexibility, String shape, double weight) {
        this.flexibility = flexibility;
        this.shape = shape;
        this.weight = weight;
    }*/

    @Override
    public String toString() {
        return "Bandage: flexibility=" + flexibility + ", shape=" + shape + ", weight=" + weight ;
    }
    @Override
    public int hashCode(){
        return 497;
    }
    public void getflexibility(int flexibility){
        this.flexibility=flexibility;
    }
    public void setflexibility(int flexibility){
        this.flexibility=flexibility;
    }
    public void getshape(String shape){
        this.shape=shape;
    }
    public void setshape(String shape){
        this.shape=shape;
    }
    public void getweight(double weight){
        this.weight=weight;
    }
    public void setweight(double weight){
        this.weight=weight;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bandage) {
                System.out.println("Ref is bandage,it will compare....");
                Bandage bandage = this;
                Bandage bandage1 = (Bandage) obj;
                if (bandage.shape.equals(bandage1.shape)) {
                    System.out.println("Both bandage are same");
                    return true;
                }
            }
        }
        return false;
    }
}
