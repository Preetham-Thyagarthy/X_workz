package external.external;

import com.xworkz.internal.Gadgets;

public class Mobile extends Gadgets {
    private String brand;
    private int cost;
    private String color;
    public Mobile(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 50;
    }
    @Override
    public String toString(){
        return("Brand:"+this.brand+"Color:"+this.color+"Cost"+this.cost);
    }

}
