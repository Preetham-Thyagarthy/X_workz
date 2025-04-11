package external.external;

import com.xworkz.internal.Sweet;

public class Jamun extends Sweet {
    private String item;
    private int cost;
    private char grade;
    public Jamun(String item, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.item=item;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 78;
    }
    @Override
    public String toString()
    {
        return("Item:"+this.item+" Cost:"+this.cost+" Grade:"+this.grade);
    }


}

