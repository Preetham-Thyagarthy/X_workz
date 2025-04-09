package com.assesments.java;
public class House {
    String owner;
    int size;
    String type;
    Room[] rooms;
    HouseKeep[] houseKeeps;

    public House(String owner, int size, String type, Room[] rooms, HouseKeep[] houseKeeps) {
        this.owner = owner;
        this.size = size;
        this.type = type;
        this.rooms = rooms;
        this.houseKeeps = houseKeeps;
    }

    public void display() {
        System.out.println("    House: Owner: " + owner + ", Size: " + size + " sq ft, Type: " + type);
        for (Room room : rooms) {
            room.display();
        }
        for (HouseKeep keep : houseKeeps) {
            keep.display();
        }
    }
}