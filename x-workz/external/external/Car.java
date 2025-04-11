package external.external;

import com.xworkz.internal.Vehicle;

public class Car extends Vehicle {
    private String brand;
    private int number;
    private String location;
    public Car(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 99;
    }
    @Override
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}
