package external.external;

import com.xworkz.internal.Gadgets;

public class Calculator extends Gadgets {
    private String brand;
    private char grade;
    private String color;
    public Calculator(String brand, char grade,String color){
        this.brand=brand;
        this.color=color;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 11;
    }
    @Override
    public String toString(){
        return ("Brand: "+this.brand+" Grade: "+this.grade+" Color: "+this.color);
    }
}
