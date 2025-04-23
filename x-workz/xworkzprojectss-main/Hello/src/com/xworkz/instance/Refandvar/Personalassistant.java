package com.xworkz.instance.Refandvar;

public class Personalassistant {
    House house=new House();
    Security security=new Security();


    public Personalassistant(){
        PrimeMinister primeMinister=new PrimeMinister();
        this.house.houseName="Ananya";
        this.house.age=22;
        this.security.minister="Siddaramayya";
        this.security.age=45;
    }
}
