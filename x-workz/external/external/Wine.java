package external.external;

import com.xworkz.internal.Liquid;

public class Wine extends Liquid {
    private String brand;
    private int cost;
    private char grade;
    public Wine(String brand, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.brand=brand;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 37;
    }
    @Override
    public String toString()
    {
        return("Brand:"+this.brand+" Cost:"+this.cost+" Grade:"+this.grade);
    }
}
