package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bucket.Box;
import com.xworkz.inheritence.internal.bucket.Bucket;
import com.xworkz.inheritence.internal.bucket.PlasticBucket;

public class BucketRunner {
    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        bucket.storeWater();
        bucket.carry();
        bucket.clean();

        System.out.println("**************************************");
        Bucket bucket1 = new PlasticBucket();
        bucket1.storeWater();
        bucket1.carry();
        bucket1.clean();

        System.out.println("**************************************");
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.storeWater();
        plasticBucket.carry();
        plasticBucket.clean();

        System.out.println("************Casting example**************");
        Box box=new Box();
        box.pour(bucket);
        box.pour(bucket1);
        box.pour(plasticBucket);
    }
}
