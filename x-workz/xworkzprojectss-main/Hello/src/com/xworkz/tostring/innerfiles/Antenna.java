package com.xworkz.tostring.innerfiles;

public class Antenna {
    private int size;
    private String flexibility;
    private double shape;

    /*public Antenna(int size, String flexibility, double shape) {
        this.size = size;
        this.flexibility = flexibility;
        this.shape = shape;
    }*/

    @Override
    public String toString() {
        return "Antenna{" +
                "size=" + size +
                ", flexibility='" + flexibility + '\'' +
                ", shape=" + shape +
                '}';
    }

    @Override
    public int hashCode(){
        return 97;
    }
    public void getsize(int size){
        this.size=size;
    }
    public void setsize(int size){
        this.size=size;
    }

    public void getflexibility(String flexibility){
        this.flexibility=flexibility;
    }
    public void setflexibility(String flexibility){
        this.flexibility=flexibility;
    }
    public void getshape(double shape){
        this.shape=shape;
    }
    public void setshape(double shape){
        this.shape=shape;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Antenna) {
                System.out.println("Ref is antenna,it will compare....");
                Antenna antenna = this;
                Antenna antenna1 = (Antenna) obj;
                if (antenna.flexibility.equals(antenna.flexibility)) {
                    System.out.println("Both antenna are same");
                    return true;
                }
            }
        }
        return false;
    }
}
