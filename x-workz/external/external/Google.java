package external.external;

import com.xworkz.internal.App;

public class Google extends App {
    private String name;
    private int number;
    private char grade;
    public Google(String name,int number,char grade){
        this.name=name;
        this.number=number;
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
        return (" Name:"+this.name+" No:"+this.number+" Grade:"+this.grade);
    }

}
