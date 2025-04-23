package com.xworkz.anu.prog;

public class Maincls {
    public static void main(String[] args) {

        Color color=Color.BLACK;
        System.out.println(color);

        for(Color clr:Color.values()){
            System.out.println(clr);
        }
    }
}
