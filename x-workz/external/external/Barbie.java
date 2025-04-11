package external.external;

import com.xworkz.internal.Toy;

public class Barbie extends Toy {
    private String brand;
    private int number;
    private String location;
    public Barbie(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 98;
    }
    @Override
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}
