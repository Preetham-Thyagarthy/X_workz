package com.xworkz.tostring.innerfiles;

public class Router {
    private int intensity;
    private String power;
    private double duration;

    public Router(int intensity, String power, double duration) {
        this.intensity = intensity;
        this.power = power;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Router [intensity=" + intensity + ", power=" + power + ", duration=" + duration + "]";
    }
    @Override
    public int hashCode(){
        return 8933;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Router) {
                System.out.println("Ref is router,it will compare....");
                Router router = this;
                Router router1 = (Router) obj;
                if (router.power.equals(router1.power) && router.intensity== router1.intensity && router.duration== router1.duration) {
                    System.out.println("Both router are same");
                    return true;
                }
            }
        }
        return false;
    }
}
