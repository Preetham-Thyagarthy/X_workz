package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.Video.Video;
import com.xworkz.inheritence.internal.Video.Movie;

public class VideoRunner {
    public static void main(String[] args) {


        Video video=new Video();
        video.clip();
        video.music();
        video.series();
        video.shortfilm();
        video.trailer();
        System.out.println("**************************************");
        Video video1 =new Movie();
        video1.clip();
        video1.music();
        video1.series();
        video1.shortfilm();
        video1.trailer();

        System.out.println("**************************************");

        Movie movie=new Movie();
        movie.clip();
        video1.music();
        video1.series();
        video1.shortfilm();
        video1.trailer();

        System.out.println("**************************************");
    }
}
