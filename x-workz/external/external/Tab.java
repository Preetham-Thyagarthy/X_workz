package external.external;

import com.xworkz.internal.Gadgets;

public class Tab extends Gadgets {
    private String brand;
    private char grade;
    private String color;
    public Tab(String brand, char grade,String color){
        this.brand=brand;
        this.color=color;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 95;
    }
    @Override
    public String toString(){
        return ("Brand: "+this.brand+" Grade: "+this.grade+" Color: "+this.color);
    }
}
