package external.external;

import com.xworkz.internal.Gadgets;

public class Laptop extends Gadgets {
    private String brand;
    private char grade;
    private String color;
    public Laptop(String brand, char grade,String color){
        this.brand=brand;
        this.color=color;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 32;
    }
    @Override
   public String toString(){
        return ("Brand: "+this.brand+" Grade: "+this.grade+" Color: "+this.color);
   }
}
