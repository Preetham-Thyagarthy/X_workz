package com.xworkz.tostring.innerfiles;

public class Sensor {
    private int power;
    private String weight;
    private double color;

    public Sensor(int power, String weight, double color) {
        this.power = power;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sensor [power=" + power + ", weight=" + weight + ", color=" + color + "]";
    }

    @Override
    public int hashCode(){
        return 90165;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Sensor) {
                System.out.println("Ref is sensor,it will compare....");
                Sensor sensor = this;
                Sensor sensor1 = (Sensor) obj;
                if (sensor.power== sensor1.power && sensor.weight.equals(sensor1.weight) && sensor.color== sensor1.color) {
                    System.out.println("Both sensor are same");
                    return true;
                }
            }
        }
        return false;
    }
}
