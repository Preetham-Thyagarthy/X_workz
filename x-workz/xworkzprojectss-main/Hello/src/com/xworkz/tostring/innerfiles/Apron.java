package com.xworkz.tostring.innerfiles;

public class Apron {
    private int shape;
    private String texture;
    private double volume;

    /*public Apron(int shape, String texture, double volume) {
        this.shape = shape;
        this.texture = texture;
        this.volume = volume;
    }*/

    @Override
    public String toString() {
        return "Apron : shape=" + shape + ", texture=" + texture + ", volume=" + volume ;
    }
    @Override
    public int hashCode(){
        return 270;
    }
    public void getshape(int shape){
        this.shape=shape;
    }
    public void setshape(int shape){
        this.shape=shape;
    }
    public void gettexture(String texture){
        this.texture=texture;
    }
    public void settexture(String texture){
        this.texture=texture;
    }
    public  void getvolume(double volume){
        this.volume=volume;
    }
    public  void setvolume(double volume){
        this.volume=volume;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Apron) {
                System.out.println("Ref is apron,it will compare....");
                Apron antenna = this;
                Apron apron1 = (Apron) obj;
                if (antenna.texture.equals(antenna.texture)) {
                    System.out.println("Both apron are same");
                    return true;
                }
            }
        }
        return false;
    }
}
