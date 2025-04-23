package com.xworkz.tostring.innerfiles;

public class Canvas {
    private int range;
    private String material;
    private double flexibility;

    public Canvas(int range, String material, double flexibility) {
        this.range = range;
        this.material = material;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Canvas [range=" + range + ", material=" + material + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 4997;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Canvas) {
                System.out.println("Ref is canvas,it will compare....");
                Canvas canvas = this;
                Canvas canvas1 = (Canvas) obj;
                if (canvas.material.equals(canvas1.material)) {
                    System.out.println("Both Canvas are same");
                    return true;
                }
            }
        }
        return false;
    }
}
