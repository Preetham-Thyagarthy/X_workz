package external.external;

import com.xworkz.internal.Soap;

public class Patanjali extends Soap {
    private String color;
    private int weight;
    private char grade;
    public Patanjali(String color,int weight,char grade){
        this.color=color;
        this.weight=weight;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 51;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.weight+" Grade:"+this.grade);

    }
}

