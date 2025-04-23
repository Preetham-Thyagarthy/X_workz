package com.xworkz.tostring.innerfiles;

public class Transmitter {
    private int volume;
    private String texture;
    private double color;

    public Transmitter(int volume, String texture, double color) {
        this.volume = volume;
        this.texture = texture;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transmitter [volume=" + volume + ", texture=" + texture + ", color=" + color + "]";
    }
    @Override
    public int hashCode(){
        return 63667;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Transmitter) {
                System.out.println("Ref is transmitter,it will compare....");
                Transmitter transmitter = this;
                Transmitter transmitter1 = (Transmitter) obj;
                if (transmitter.volume== transmitter1.volume && transmitter.texture.equals(transmitter1.texture) && transmitter.color== transmitter1.color) {
                    System.out.println("Both transmitter are same");
                    return true;
                }
            }
        }
        return false;
    }
}
