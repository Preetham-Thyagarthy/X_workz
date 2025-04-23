package com.xworkz.abstractmthd.rcb;

public abstract class Match {

    int score;
    String color;
    boolean win;


    public Match(int score, String color, boolean win) {
        this.score = score;
        this.color=color;
        this.win=win;
    }
}
