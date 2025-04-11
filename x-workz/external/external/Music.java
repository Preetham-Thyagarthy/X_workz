package external.external;

import com.xworkz.internal.Appu;

public class Music extends Appu {
    private String name;
    private int rating;
    private char grade;
    public Music(String name,int rating,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.rating=rating;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 33;
    }
    @Override


    public String toString()
    {
        return ("Name: "+this.name+" Grade: "+this.grade+" Rating :"+this.rating);
    }
}
