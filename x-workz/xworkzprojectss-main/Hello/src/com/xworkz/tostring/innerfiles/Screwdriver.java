package com.xworkz.tostring.innerfiles;

public class Screwdriver {
    private int size;
    private String weight;
    private double capacity;

    public Screwdriver(int size, String weight, double capacity) {
        this.size = size;
        this.weight = weight;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Screwdriver [size=" + size + ", weight=" + weight + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 69820;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Screwdriver) {
                System.out.println("Ref is screwdriver,it will compare....");
                Screwdriver screwdriver = this;
                Screwdriver screwdriver1 = (Screwdriver) obj;
                if (screwdriver.size== screwdriver1.size && screwdriver.weight.equals(screwdriver1.weight) && screwdriver.capacity== screwdriver1.capacity) {
                    System.out.println("Both screwdriver are same");
                    return true;
                }
            }
        }
        return false;
    }
}
