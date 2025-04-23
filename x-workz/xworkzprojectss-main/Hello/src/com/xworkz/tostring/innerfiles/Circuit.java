package com.xworkz.tostring.innerfiles;

public class Circuit {
    private int thickness;
    private String width;
    private double capacity;

    public Circuit(int thickness, String width, double capacity) {
        this.thickness = thickness;
        this.width = width;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Circuit [thickness=" + thickness + ", width=" + width + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode(){
        return 12397;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Circuit) {
                System.out.println("Ref is circuit,it will compare....");
                Circuit circuit = this;
                Circuit circuit1 = (Circuit) obj;
                if (circuit.width.equals(circuit1.width)) {
                    System.out.println("Both circuit are same");
                    return true;
                }
            }
        }
        return false;
    }
}
