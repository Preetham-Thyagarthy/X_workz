package com.xworkz.instance.District;

public class Company {
    String location;
    int numOfCompany;
    String compName;



    String[] education={"BBA","B.E","BCa","BCom","MBA","MCa","MCom"};
    public Company(){
        for(String edu:education){
            System.out.println(edu);
        }

    }
}
