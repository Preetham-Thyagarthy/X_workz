package com.xworkz.tostring.innerfiles;

public class Ladder {
    private int color;
    private String flexibility;
    private double shape;

    public Ladder(int color, String flexibility, double shape) {
        this.color = color;
        this.flexibility = flexibility;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Ladder [color=" + color + ", flexibility=" + flexibility + ", shape=" + shape + "]";
    }
    @Override
    public int hashCode(){
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Ladder) {
                System.out.println("Ref is ladder,it will compare....");
                Ladder ladder = this;
                Ladder ladder1 = (Ladder) obj;
                if (ladder.flexibility.equals(ladder1.flexibility) && ladder.color== ladder1.color) {
                    System.out.println("Both ladder are same");
                    return true;
                }
            }
        }
        return false;
    }
}
