package com.xworkz.tostring.innerfiles;

public class MarkerPen {
    private int color;
    private String brightness;
    private double duration;

    public MarkerPen(int color, String brightness, double duration) {
        this.color = color;
        this.brightness = brightness;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MarkerPen [color=" + color + ", brightness=" + brightness + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 40;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof MarkerPen) {
                System.out.println("Ref is markerpen,it will compare....");
                MarkerPen markerpen = this;
                MarkerPen markerpen1 = (MarkerPen) obj;
                if (markerpen.brightness.equals(markerpen1.brightness) && markerpen.color== markerpen1.color) {
                    System.out.println("Both markerpen are same");
                    return true;
                }
            }
        }
        return false;
    }
}
