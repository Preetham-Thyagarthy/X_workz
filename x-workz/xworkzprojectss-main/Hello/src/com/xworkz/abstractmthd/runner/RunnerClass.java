package com.xworkz.abstractmthd.runner;

import com.xworkz.abstractmthd.artist.Design;
import com.xworkz.abstractmthd.artist.Sketch;
import com.xworkz.abstractmthd.building.Construct;
import com.xworkz.abstractmthd.building.Site;
import com.xworkz.abstractmthd.future.Future;
import com.xworkz.abstractmthd.future.Goals;
import com.xworkz.abstractmthd.rcb.FinalMatch;
import com.xworkz.abstractmthd.rcb.Match;
import com.xworkz.abstractmthd.trip.GoaTrip;

public class RunnerClass {
    public static void main(String[] args) {
        Sketch draw=new Design();
        draw.Painting();
        draw.Drawing();
        System.out.println("*********************************************************************");

        Site build=new Construct();
        build.area();
        System.out.println("*********************************************************************");

        Goals future=new Goals();
        future.learn();
        future.practice();
        System.out.println("*********************************************************************");

        FinalMatch match=new FinalMatch(106,"Red Jersey",false);
        match.display();
        System.out.println("*********************************************************************");

        GoaTrip trip=new GoaTrip(4);
        trip.displayed();
        GoaTrip trip1=new GoaTrip(6,"Goa");
        trip1.displayed();
        GoaTrip trip2=new GoaTrip(15,"Kashmir",55670.04,true);
        trip2.displayed();
    }
}
