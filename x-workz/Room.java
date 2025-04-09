package com.assesments.java;
public class Room {
    String type;
    int area;
    int windows;
    boolean attachedBathroom;

    public Room(String type, int area, int windows, boolean attachedBathroom) {
        this.type = type;
        this.area = area;
        this.windows = windows;
        this.attachedBathroom = attachedBathroom;
    }

    public void display() {
        System.out.println("      Room: Type: " + type + ", Area: " + area + " sq ft, Windows: " + windows + ", Attached Bathroom: " + attachedBathroom);
    }
}