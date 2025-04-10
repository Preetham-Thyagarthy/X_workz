package com.xworkz.external;

import com.xworkz.internal.Nation;

public class China extends Nation {
    private String name;
    private char grade;
    private String animal;
    public China(String name,char grade,String animal){
        this.animal=animal;
        this.grade=grade;
        this.name=name;

    }
    public String toString()
    {
        return ("Name: "+this.name+" Animal: "+this.animal+" Grade: "+this.grade);
    }

}
