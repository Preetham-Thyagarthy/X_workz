package com.xworkz.tostring.innerfiles;

public class Robot {
    private int width;
    private String flexibility;
    private double range;

    public Robot(int width, String flexibility, double range) {
        this.width = width;
        this.flexibility = flexibility;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Robot [width=" + width + ", flexibility=" + flexibility + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 450;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Robot) {
                System.out.println("Ref is robot,it will compare....");
                Robot robot = this;
                Robot robot1 = (Robot) obj;
                if (robot.flexibility.equals(robot1.flexibility) && robot.width== robot1.width && robot.range== robot1.range) {
                    System.out.println("Both robot are same");
                    return true;
                }
            }
        }
        return false;
    }
}
