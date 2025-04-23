package com.xworkz.inheritence.internal.notepad;

public class Novel extends Notepad {
    public Novel() {
        super();
        System.out.println("Running non-arg constructor Novel");
    }
    @Override
    public void read() {
        System.out.println("Read");
    }
    @Override
    public void write() {
        System.out.println("Written by an author");
    }
    @Override
    public void publish() {
        System.out.println("Published");
    }
    @Override
    public void genre() {
        System.out.println("Has a genre");
    }
    @Override
    public void pages() {
        System.out.println("Has pages");
    }
}
