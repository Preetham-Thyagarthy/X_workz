package com.xworkz.instance.City;

public class House {
    int[] room={
            1,2,3
    };
    String[] HouseKeep={
            "Hall","Bathroon","Kitchen"
    };

    public House(){
        for (int r:room){
            System.out.println(r);
        }
        for(String hk:HouseKeep){
            System.out.println(hk);
        }
    }
}
