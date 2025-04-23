package com.xworkz.inheritence.internal.instrument;

public class Instrument {
        public Instrument() {
            System.out.println("Running non-arg constructor Instrument");
        }
        public void play() {
            System.out.println("Instrument is played");
        }
        public void sound() {
            System.out.println("Instrument produces sound");
        }
        public void type() {
            System.out.println("Instrument has a type");
        }
        public void maintenance() {
            System.out.println("Instrument requires maintenance");
        }
        public void brand() {
            System.out.println("Instrument has different brands");
        }
}
