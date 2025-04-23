package com.xworkz.inheritence.internal.church;

public class CatholicChurch extends Church {
    public CatholicChurch() {
        super();
        System.out.println("Running non-arg constructor CatholicChurch");
    }
    @Override
    public void attendService() {
        System.out.println("Sunday church service");
    }
    @Override
    public void pray() {
        System.out.println("Praying");
    }
    @Override
    public void lightCandles() {
        System.out.println("Lighting candles");
    }
    @Override
    public void singHymns() {
        System.out.println("Singing hymns");
    }
    @Override
    public void readBible() {
        System.out.println("Reading the Bible");
    }
    public void fast(){
        System.out.println("Fasting before prayers");
    }
}
