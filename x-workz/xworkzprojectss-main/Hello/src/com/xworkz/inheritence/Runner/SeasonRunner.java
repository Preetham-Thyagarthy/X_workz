package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.season.Season;
import com.xworkz.inheritence.internal.season.Winter;

public class SeasonRunner {
    public static void main(String[] args) {


        Season season = new Season();
        season.weather();
        season.duration();
        season.activities();
        season.temperature();
        season.impact();
        System.out.println("**************************************");
        Season season1 = new Winter();
        season1.weather();
        season1.duration();
        season1.activities();
        season1.temperature();
        season1.impact();

        System.out.println("-----------");

        Winter winter = new Winter();
        winter.weather();
        winter.duration();
        winter.activities();
        winter.temperature();
        winter.impact();
    }
}
