package com.xworkz.instance.District;

public class Experience {
    int year;
    boolean exp;
    String compName;

    String[] ExperienceDetail={
            "4 year in Cognizant","2 year in TCS"
    };
    public Experience(){
        for(String exp:ExperienceDetail){
            System.out.println(exp);
        }

    }
}
