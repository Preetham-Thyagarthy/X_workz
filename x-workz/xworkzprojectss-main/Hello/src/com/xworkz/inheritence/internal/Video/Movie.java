package com.xworkz.inheritence.internal.Video;

public class Movie extends Video{
    public Movie() {
        super();
        System.out.println("Running non-arg constructor Movies");
    }
    @Override
    public void clip() {
        System.out.println("Small clip");
    }
    @Override
    public void music() {
        System.out.println("Music is played");
    }
    @Override
    public void series() {
        System.out.println("Play Web series");
    }
    @Override
    public void shortfilm() {
        System.out.println("Short films are made");
    }
    @
    Override
    public void trailer() {
        System.out.println("Trailer of the movie is released");
    }
}
