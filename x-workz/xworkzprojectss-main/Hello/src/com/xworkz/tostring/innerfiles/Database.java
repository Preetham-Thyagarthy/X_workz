package com.xworkz.tostring.innerfiles;

public class Database {
    private int material;
    private String duration;
    private double quantity;

    public Database(int material, String duration, double quantity) {
        this.material = material;
        this.duration = duration;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Database [material=" + material + ", duration=" + duration + ", material=" + quantity + "]";
    }
    @Override
    public int hashCode(){
        return 6897;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Database) {
                System.out.println("Ref is database,it will compare....");
                Database database = this;
                Database database1 = (Database) obj;
                if (database.duration.equals(database1.duration)) {
                    System.out.println("Both database are same");
                    return true;
                }
            }
        }
        return false;
    }
}
