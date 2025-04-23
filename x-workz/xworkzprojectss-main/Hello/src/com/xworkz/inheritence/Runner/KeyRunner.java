package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.lock.Key;
import com.xworkz.inheritence.internal.lock.Lock;

public class KeyRunner {
    public static void main(String[] args) {

        Key key=new Key();
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();
        System.out.println("**************************************");
        Key key1 =new Lock();
        key1.big();
        key1.close();
        key1.open();
        key1.white();
        key1.small();

        System.out.println("**************************************");
        Lock lock=new Lock();
        lock.big();
        lock.close();
        lock.open();
        lock.white();
        lock.small();
    }
}
