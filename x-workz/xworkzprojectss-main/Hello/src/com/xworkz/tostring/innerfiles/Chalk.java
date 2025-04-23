package com.xworkz.tostring.innerfiles;

public class Chalk {
    private int power;
    private String size;
    private double density;

    public Chalk(int power, String size, double density) {
        this.power = power;
        this.size = size;
        this.density = density;
    }

    @Override
    public String toString() {
        return "Chalk [power=" + power + ", size=" + size + ", power=" + density + "]";
    }
    @Override
    public int hashCode(){
        return 897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Chalk) {
                System.out.println("Ref is chalk,it will compare....");
                Chalk chalk = this;
                Chalk chalk1 = (Chalk) obj;
                if (chalk.size.equals(chalk1.size)) {
                    System.out.println("Both chalk are same");
                    return true;
                }
            }
        }
        return false;
    }
}
