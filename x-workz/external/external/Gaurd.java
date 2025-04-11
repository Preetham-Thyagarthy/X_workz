package external.external;

import com.xworkz.internal.Police;

public class Gaurd extends Police {
    private String brand;
    private int cost;
    private String color;
    public  Gaurd(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 12;
    }
    @Override
    public String toString(){
        return(" Brand:"+this.brand+" Color:"+this.color+" Cost"+this.cost);
    }
}
