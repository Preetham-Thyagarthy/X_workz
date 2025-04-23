package com.xworkz.instance.District;

public class Housekeep {
    int noOfPeople;
    String Name;

    String[] Transport ={
            "Car","Train","Aeroplane" ,"Ship"
    };
    public Housekeep(){
        for(String tra:Transport){
            System.out.println(tra);
        }
    }
}
