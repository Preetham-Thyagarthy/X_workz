package external.external;

import com.xworkz.internal.Bulb;

public class Tooblight  extends Bulb {
    private String brand;
    private int cost;
    private char grade;
    public Tooblight(String brand,int cost,char grade){
        this.brand=brand;
        this.grade=grade;
        this.cost=cost;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 49;
    }

    @Override
    public String toString() {
        return(" Brand:"+this.brand+" Grade:"+this.grade+" Cost:"+this.cost);
    }
}
