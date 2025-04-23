package com.xworkz.tostring.innerfiles;

public class Paper {
    private int size;
    private String shape;
    private double range;

    public Paper(int size, String shape, double range) {
        this.size = size;
        this.shape = shape;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Paper [size=" + size + ", shape=" + shape + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 2036;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Paper) {
                System.out.println("Ref is paper,it will compare....");
                Paper paper = this;
                Paper paper1 = (Paper) obj;
                if (paper.shape.equals(paper1.shape) && paper.size== paper1.size) {
                    System.out.println("Both paper are same");
                    return true;
                }
            }
        }
        return false;
    }
}
