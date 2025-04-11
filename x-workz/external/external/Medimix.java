package external.external;

import com.xworkz.internal.Soap;

public class Medimix extends Soap {
    private String color;
    private int weight;
    private char grade;
    public Medimix(String color,int weight,char grade){
        this.color=color;
        this.weight=weight;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 04;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.weight+" Grade:"+this.grade);

    }
}
