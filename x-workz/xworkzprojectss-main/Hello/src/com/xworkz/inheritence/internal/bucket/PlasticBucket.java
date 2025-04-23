package com.xworkz.inheritence.internal.bucket;

public class PlasticBucket extends Bucket {
    public PlasticBucket() {
        super();
        System.out.println("Running non-arg constructor PlasticBucket");
    }
    @Override
    public void storeWater() {
        System.out.println("Storing water");
    }
    @Override
    public void carry() {
        System.out.println("Used for carrying liquid");
    }
    @Override
    public void clean() {
        System.out.println("Being cleaned");
    }
    public void use(){
        System.out.println("Usage of bucket is good");
    }
}
