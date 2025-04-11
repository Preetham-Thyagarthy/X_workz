package external.external;

import com.xworkz.internal.Animal;

public class Cat extends Animal {
    private String name;
    private int number;
    private String location;
    public Cat(String name,int number,String location){
        this.name=name;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 28;
    }
    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Location:" +this.location+" Number:"+this.number);
    }
}
