package com.xworkz.tostring.innerfiles;

public class Whiteboard {
    private int shape;
    private String thickness;
    private double size;

    public Whiteboard(int shape, String thickness, double size) {
        this.shape = shape;
        this.thickness = thickness;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Whiteboard [shape=" + shape + ", thickness=" + thickness + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 67;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Whiteboard) {
                System.out.println("Ref is whiteboard,it will compare....");
                Whiteboard whiteboard = this;
                Whiteboard whiteboard1 = (Whiteboard) obj;
                if (whiteboard.thickness.equals(whiteboard1.thickness) && whiteboard.size== whiteboard1.size && whiteboard.shape== whiteboard1.shape) {
                    System.out.println("Both whiteboard are same");
                    return true;
                }
            }
        }
        return false;
    }
}
