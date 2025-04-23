package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.gathering.Gathering;
import com.xworkz.inheritence.internal.gathering.BirthdayGathering;
import com.xworkz.inheritence.internal.gathering.Wedding;

public class GatheringRunner {
    public static void main(String[] args) {


        Gathering gathering = new Gathering();
        gathering.invitePeople();
        gathering.haveFood();
        gathering.playMusic();
        gathering.dance();
        gathering.decorateVenue();
        System.out.println("**************************************");
        Gathering gathering1 = new BirthdayGathering();
        gathering1.invitePeople();
        gathering1.haveFood();
        gathering1.playMusic();
        gathering1.dance();
        gathering1.decorateVenue();

        System.out.println("**************************************");
        BirthdayGathering birthdayParty = new BirthdayGathering();
        birthdayParty.invitePeople();
        birthdayParty.haveFood();
        birthdayParty.playMusic();
        birthdayParty.dance();
        birthdayParty.decorateVenue();

        System.out.println("************Casting example**************");
        Wedding wedding=new Wedding();
        wedding.venue(gathering);
        wedding.venue(gathering1);
        wedding.venue(birthdayParty);

    }
}
