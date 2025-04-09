package com.assesments.java;
public class HouseKeep {
    String name;
    int experience;
    boolean liveIn;
    Transport transport;

    public HouseKeep(String name, int experience, boolean liveIn, Transport transport) {
        this.name = name;
        this.experience = experience;
        this.liveIn = liveIn;
        this.transport = transport;
    }

    public void display() {
        System.out.println("      HouseKeep: Name: " + name + ", Experience: " + experience + " years, Live-in: " + liveIn);
        transport.display();
    }
}