package com.xworkz.classwork;

public class Tshirt {
    private String brand;
    private int size;
    private String color;

    @Override
    public String toString() {
        return "Tshirt{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public void getbrand(String brand){
        this.brand=brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void getsize(int size){
        this.size=size;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void getcolor(String color){
        this.color=color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Refer is not null");
            if(obj instanceof Tshirt){
                System.out.println("Ref is tshirt,it will compare");
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt) obj;
                if(tshirt1.brand.equals(tshirt2.brand) && tshirt1.size==tshirt2.size && tshirt1.color==tshirt2.color)
                {
                    System.out.println("Both tshirts are same");
                    return true;
                }
            }
        }
        return false;
    }

}

