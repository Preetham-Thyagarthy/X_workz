package com.xworkz.external;

import com.xworkz.internal.Appu;

public class Movie extends Appu {
    private String name;
    private int rating;
    private char grade;
    public Movie(String name,int rating,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.rating=rating;
    }


    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Grade: "+this.grade+" Rating :"+this.rating);
    }

}
