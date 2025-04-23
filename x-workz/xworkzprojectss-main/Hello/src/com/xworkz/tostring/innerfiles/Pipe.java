package com.xworkz.tostring.innerfiles;

public class Pipe {
    private int range;
    private String power;
    private double size;

    public Pipe(int range, String power, double size) {
        this.range = range;
        this.power = power;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pipe [range=" + range + ", power=" + power + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 2003;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Pipe) {
                System.out.println("Ref is pipe,it will compare....");
                Pipe pipe = this;
                Pipe pipe1 = (Pipe) obj;
                if (pipe.power.equals(pipe1.power) && pipe.range== pipe1.range) {
                    System.out.println("Both pipe are same");
                    return true;
                }
            }
        }
        return false;
    }
}
