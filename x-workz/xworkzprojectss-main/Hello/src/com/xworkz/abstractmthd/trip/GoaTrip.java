package com.xworkz.abstractmthd.trip;

public class GoaTrip extends Plan{
    public GoaTrip(int days){
        super(days);
    }
    public GoaTrip(int days,String places){
        super(days, places);
    }
    public GoaTrip(int days,String places,double price,boolean approval){
        super(days, places, price, approval);
    }
    public void displayed(){
        System.out.println("Trip is to: "+days+", "+places+", "+price+", "+approval);
    }
}
