package com.xworkz.inheritence.internal.bucket;

public class Box {
    public void pour(Bucket bucket) {
        bucket.storeWater();
        bucket.carry();
        bucket.clean();

        if (bucket instanceof PlasticBucket) {
            System.out.println("Bucket is an instance of PlasticBucket");
            PlasticBucket plasticBucket = (PlasticBucket) bucket;
            plasticBucket.use();
        }
    }
}
