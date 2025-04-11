package external.external;

import com.xworkz.internal.Animal;

public class Horse extends Animal {
    private String name;
    private int number;
    private String location;
    public Horse(String name,int number,String location){
        this.name=name;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 14;
    }
    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Location:" +this.location+" Number:"+this.number);
    }
}
