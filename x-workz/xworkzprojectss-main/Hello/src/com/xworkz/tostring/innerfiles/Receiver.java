package com.xworkz.tostring.innerfiles;

public class Receiver {
    private int power;
    private String height;
    private double weight;

    public Receiver(int power, String height, double weight) {
        this.power = power;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Receiver [power=" + power + ", height=" + height + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3021;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Receiver) {
                System.out.println("Ref is receiver,it will compare....");
                Receiver receiver = this;
                Receiver receiver1 = (Receiver) obj;
                if (receiver.height.equals(receiver1.height) && receiver.power== receiver1.power && receiver.weight== receiver1.weight) {
                    System.out.println("Both receiver are same");
                    return true;
                }
            }
        }
        return false;
    }
}
