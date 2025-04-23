package com.xworkz.tostring.innerfiles;

public class Tank {
    private int height;
    private String texture;
    private double speed;

    public Tank(int height, String texture, double speed) {
        this.height = height;
        this.texture = texture;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Tank [height=" + height + ", texture=" + texture + ", speed=" + speed + "]";
    }

    @Override
    public int hashCode(){
        return 7547;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Tank) {
                System.out.println("Ref is tank,it will compare....");
                Tank tank = this;
                Tank tank1 = (Tank) obj;
                if (tank.height== tank1.height && tank.texture.equals(tank1.texture) && tank.speed== tank1.speed) {
                    System.out.println("Both tank are same");
                    return true;
                }
            }
        }
        return false;
    }
}
