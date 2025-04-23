package com.xworkz.tostring.innerfiles;

public class Highlighter {
    private int width;
    private String color;
    private double intensity;

    public Highlighter(int width, String color, double intensity) {
        this.width = width;
        this.color = color;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Highlighter [width=" + width + ", color=" + color + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 3026;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Highlighter) {
                System.out.println("Ref is highlighter,it will compare....");
                Highlighter highlighter = this;
                Highlighter highlighter1 = (Highlighter) obj;
                if (highlighter.color.equals(highlighter1.color) && highlighter.width== highlighter1.width) {
                    System.out.println("Both highlighter are same");
                    return true;
                }
            }
        }
        return false;
    }
}
