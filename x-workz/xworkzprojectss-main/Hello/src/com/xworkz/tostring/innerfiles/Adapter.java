package com.xworkz.tostring.innerfiles;


public class Adapter {
    private int range;
    private String color;
    private double size;

    /*public Adapter(int range, String color, double size) {
        this.range = range;
        this.color = color;
        this.size = size;
    }*/

    @Override
    public String toString() {
        return "Adapter{" +
                "range=" + range +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode(){
        return 99;
    }
    public void getrange(int range){
        this.range=range;
    }
    public void setrange(int range){
        this.color=color;
    }
    public void getcolor(String color){
        this.color=color;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public void getsize(double size){
        this.size=size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Adapter) {
                System.out.println("Ref is adapter,it will compare....");
                Adapter adapter1 = this;
                Adapter adapter2 = (Adapter) obj;
                if (adapter1.color.equals(adapter2.color)) {
                    System.out.println("Both adapters are same");
                    return true;
                }
            }
        }
        return false;
    }
}
