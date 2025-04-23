package com.xworkz.tostring.innerfiles;

public class Bucket {
    private int size;
    private String duration;
    private double volume;

    public Bucket(int size, String duration, double volume) {
        this.size = size;
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bucket: size=" + size + ", duration=" + duration + ", volume=" + volume;
    }
    @Override
    public int hashCode(){
        return 790;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bucket) {
                System.out.println("Ref is bucket,it will compare....");
                Bucket bucket = this;
                Bucket bucket1 = (Bucket) obj;
                if (bucket.duration.equals(bucket1.duration)) {
                    System.out.println("Both bucket are same");
                    return true;
                }
            }
        }
        return false;
    }
}
