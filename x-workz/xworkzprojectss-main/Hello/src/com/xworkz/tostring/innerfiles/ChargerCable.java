package com.xworkz.tostring.innerfiles;

public class ChargerCable {
    private int capacity;
    private String flexibility;
    private double intensity;

    public ChargerCable(int capacity, String flexibility, double intensity) {
        this.capacity = capacity;
        this.flexibility = flexibility;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "ChargerCable [capacity=" + capacity + ", flexibility=" + flexibility + ", intensity=" + intensity + "]";
    }
    @Override
    public int hashCode(){
        return 2397;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof ChargerCable) {
                System.out.println("Ref is chargercable,it will compare....");
                ChargerCable chargercable = this;
                ChargerCable chargerCable1 = (ChargerCable) obj;
                if (chargercable.flexibility.equals(chargerCable1.flexibility)) {
                    System.out.println("Both chargercable are same");
                    return true;
                }
            }
        }
        return false;
    }
}
