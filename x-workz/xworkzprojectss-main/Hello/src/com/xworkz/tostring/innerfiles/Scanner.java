package com.xworkz.tostring.innerfiles;

public class Scanner {
    private int brightness;
    private String power;
    private double thickness;

    public Scanner(int brightness, String power, double thickness) {
        this.brightness = brightness;
        this.power = power;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Scanner [brightness=" + brightness + ", power=" + power + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 5990;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Scanner) {
                System.out.println("Ref is scanner,it will compare....");
                Scanner scanner = this;
                Scanner scanner1 = (Scanner) obj;
                if (scanner.brightness== scanner1.brightness && scanner.power.equals(scanner1.power) && scanner.thickness== scanner1.thickness) {
                    System.out.println("Both scanner are same");
                    return true;
                }
            }
        }
        return false;
    }
}
