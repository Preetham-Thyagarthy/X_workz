package com.xworkz.tostring.innerfiles;

public class Label {
    private int power;
    private String speed;
    private double flexibility;

    public Label(int power, String speed, double flexibility) {
        this.power = power;
        this.speed = speed;
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
        return "Label [power=" + power + ", speed=" + speed + ", flexibility=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 410;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Label) {
                System.out.println("Ref is label,it will compare....");
                Label label = this;
                Label label1 = (Label) obj;
                if (label.speed.equals(label1.speed) && label.power== label1.power) {
                    System.out.println("Both label are same");
                    return true;
                }
            }
        }
        return false;
    }
}
