package com.xworkz.tostring.innerfiles;

public class Tape {
    private int range;
    private String power;
    private double shape;

    public Tape(int range, String power, double shape) {
        this.range = range;
        this.power = power;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Tape [range=" + range + ", power=" + power + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 3687;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Tape) {
                System.out.println("Ref is tape,it will compare....");
                Tape tape = this;
                Tape tape1 = (Tape) obj;
                if (tape.shape== tape1.shape && tape.power.equals(tape1.power) && tape.range== tape1.range) {
                    System.out.println("Both tape are same");
                    return true;
                }
            }
        }
        return false;
    }
}
