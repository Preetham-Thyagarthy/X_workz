package external.external;

import com.xworkz.internal.Nation;

public class India extends Nation {
    private String name;
    private char grade;
    private String animal;
    public India(String name,char grade,String animal){
        this.animal=animal;
        this.grade=grade;
        this.name=name;

    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 03;
    }
    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Animal: "+this.animal+" Grade: "+this.grade);
    }

}
