package com.xworkz.instance.City;
import com.xworkz.instance.District.Ward;

public class City {


        String[] Ward={
                "floor","place"
        };
        public City(){
            for(String ward: Ward){
                System.out.println(ward);
            }
        }
    }

