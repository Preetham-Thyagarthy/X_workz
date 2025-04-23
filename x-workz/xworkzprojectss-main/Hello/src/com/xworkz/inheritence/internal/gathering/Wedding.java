package com.xworkz.inheritence.internal.gathering;

public class Wedding {
    public void venue(Gathering gathering) {
        gathering.invitePeople();
        gathering.haveFood();
        gathering.playMusic();
        gathering.dance();
        gathering.decorateVenue();

        if (gathering instanceof BirthdayGathering) {
            System.out.println("Gathering is an instance of BirthdayGathering");
            BirthdayGathering birthday = (BirthdayGathering) gathering;
            birthday.food();
        }
    }

}
