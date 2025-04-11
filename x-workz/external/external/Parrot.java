package external.external;

import com.xworkz.internal.Bird;

public class Parrot extends Bird {
    private String name;
    private int number;
    private String location;
    public Parrot(String name,int number,String location){
        this.name=name;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 69;
    }
    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Location:" +this.location+" Number:"+this.number);
    }
}
