package com.xworkz.tostring.innerfiles;

public class Clipboard {
    private int density;
    private String shape;
    private double range;

    public Clipboard(int density, String shape, double range) {
        this.density = density;
        this.shape = shape;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Clipboard [density=" + density + ", shape=" + shape + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 33397;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Clipboard) {
                System.out.println("Ref is clipboard,it will compare....");
                Clipboard clipboard = this;
                Clipboard clipboard1 = (Clipboard) obj;
                if (clipboard.shape.equals(clipboard1.shape)) {
                    System.out.println("Both clipboard are same");
                    return true;
                }
            }
        }
        return false;
    }
}
