package com.xworkz.inheritence.internal.gathering;

public class BirthdayGathering extends Gathering {
    public BirthdayGathering() {
        super();
        System.out.println("Running non-arg constructor BirthdayParty");
    }
    @Override
    public void invitePeople() {
        System.out.println("Inviting friends and family");
    }
    @Override
    public void haveFood() {
        System.out.println("Delicious food for guests");
    }
    @Override
    public void playMusic() {
        System.out.println("Played to entertain guests");
    }
    @Override
    public void dance() {
        System.out.println("Dance and enjoy");
    }
    @Override
    public void decorateVenue() {
        System.out.println("Involve venue decoration");
    }
    public void food(){
        System.out.println("There will be varieties of food");
    }
}
