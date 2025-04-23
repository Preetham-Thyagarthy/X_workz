package com.xworkz.classwork;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt1=new Tshirt();
        tshirt1.getbrand("X-workz");
        tshirt1.getsize(3);
        tshirt1.getcolor("Black");


        Tshirt tshirt2 =new Tshirt();
        tshirt2.getbrand("X-workz");
        tshirt2.getsize(3);
        tshirt2.getcolor("Black");
        System.out.println(tshirt1.equals(tshirt2));
    }
}
