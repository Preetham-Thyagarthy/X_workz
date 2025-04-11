package external.external;

import com.xworkz.internal.Fan;

public class StandFan extends Fan {
    private String name;
    private int rating;
    private char grade;
    public StandFan(String name, int rating, char grade)
    {
        this.grade=grade;
        this.name=name;
        this.rating=rating;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 68;
    }


    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Grade: "+this.grade+" Rating :"+this.rating);
    }

}

