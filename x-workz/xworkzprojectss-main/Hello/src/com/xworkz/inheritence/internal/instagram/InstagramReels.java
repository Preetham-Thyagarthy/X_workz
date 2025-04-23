package com.xworkz.inheritence.internal.instagram;

public class InstagramReels extends Instagram {
    public InstagramReels() {
        super();
        System.out.println("Running non-arg constructor InstagramReels");
    }
    @Override
    public void postPhoto() {
        System.out.println("Posting photos");
    }
    @Override
    public void sendMessage() {
        System.out.println("Sending messages");
    }
    @Override
    public void followUsers() {
        System.out.println("Following users");
    }
    @Override
    public void viewStories() {
        System.out.println("Viewing stories");
    }
    @Override
    public void likePosts() {
        System.out.println("Liking posts");
    }
    public void photos(){
        System.out.println("Posts are liked");
    }
}
