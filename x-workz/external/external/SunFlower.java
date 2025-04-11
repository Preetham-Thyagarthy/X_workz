package external.external;

import com.xworkz.internal.Flower;

public class SunFlower extends Flower {
    private String color;
    private int cost;
    private char grade;
    public SunFlower(String color,int cost,char grade){
        this.color=color;
        this.cost=cost;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 35;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.cost+" Grade:"+this.grade);

    }
}
