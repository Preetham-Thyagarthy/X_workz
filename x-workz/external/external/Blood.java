package external.external;

import com.xworkz.internal.Liquid;

public class Blood extends Liquid {
    private String brand;
    private int cost;
    private char grade;
    public Blood(String brand, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.brand=brand;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 48;
    }
    @Override
    public String toString()
    {
        return("Brand:"+this.brand+" Cost:"+this.cost+" Grade:"+this.grade);
    }
}
