package external.external;

import com.xworkz.internal.Bed;

public class BedSheet extends Bed{
    private String brand;
    private int number;
    private String location;
    public BedSheet(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 73;
    }
    @Override
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}




