package com.xworkz.anu.prog;

public class PosterRunner {
        public static void main(String[] args) {
            Theater theater = new Theater();
            Poster poster = new Poster();

            theater.show(poster);
            theater.show(null);
        }
    }

