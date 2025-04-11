package external.external;

import com.xworkz.internal.Bulb;

import java.util.SplittableRandom;

public class Light extends Bulb {
    private String brand;
    private int cost;
    private char grade;
    public Light(String brand, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.brand=brand;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 75;
    }
    @Override
    public String toString()
    {
        return("Brand:"+this.brand+" Cost:"+this.cost+" Grade:"+this.grade);
    }

}
