package com.xworkz.tostring.innerfiles;

public class Outlet {
    private int volume;
    private String speed;
    private double flexibility;

    public Outlet(int volume, String speed, double flexibility) {
        this.volume = volume;
        this.speed = speed;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Outlet [volume=" + volume + ", speed=" + speed + ", speed=" + flexibility + "]";
    }
    @Override
    public int hashCode(){
        return 1010;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Outlet) {
                System.out.println("Ref is outlet,it will compare....");
                Outlet outlet = this;
                Outlet outlet1 = (Outlet) obj;
                if (outlet.speed.equals(outlet1.speed) && outlet.volume== outlet1.volume) {
                    System.out.println("Both outlet are same");
                    return true;
                }
            }
        }
        return false;
    }
}
