package com.xworkz.tostring.innerfiles;

public class Folder {
    private int height;
    private String volume;
    private double weight;

    public Folder(int height, String volume, double weight) {
        this.height = height;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Folder [height=" + height + ", volume=" + volume + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 3021;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Folder) {
                System.out.println("Ref is folder,it will compare....");
                Folder folder = this;
                Folder folder1 = (Folder) obj;
                if (folder.volume.equals(folder1.volume) && folder.weight== folder1.weight) {
                    System.out.println("Both folder are same");
                    return true;
                }
            }
        }
        return false;
    }
}
