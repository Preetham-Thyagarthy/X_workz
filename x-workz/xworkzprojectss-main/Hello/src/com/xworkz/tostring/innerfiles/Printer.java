package com.xworkz.tostring.innerfiles;

public class Printer {
    private int width;
    private String material;
    private double weight;

    public Printer(int width, String material, double weight) {
        this.width = width;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Printer [width=" + width + ", material=" + material + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 20036;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Printer) {
                System.out.println("Ref is printer,it will compare....");
                Printer printer = this;
                Printer printer1 = (Printer) obj;
                if (printer.material.equals(printer1.material) && printer.width==printer1.width) {
                    System.out.println("Both printer are same");
                    return true;
                }
            }
        }
        return false;
    }
}
