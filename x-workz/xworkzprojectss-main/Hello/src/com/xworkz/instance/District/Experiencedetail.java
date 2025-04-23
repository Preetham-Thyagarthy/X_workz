package com.xworkz.instance.District;

public class Experiencedetail {
    String place;
    int noOfYear;

    String[] education ={
            "B.E","MBA"
    };
    public Experiencedetail(){
        for (String expi:education){
            System.out.println(expi);
        }
    }
}
