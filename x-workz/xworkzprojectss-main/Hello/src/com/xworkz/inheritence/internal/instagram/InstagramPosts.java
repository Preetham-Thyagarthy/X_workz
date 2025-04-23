package com.xworkz.inheritence.internal.instagram;

public class InstagramPosts {
    public void opening(Instagram instagram) {
        instagram.postPhoto();
        instagram.sendMessage();
        instagram.followUsers();
        instagram.viewStories();
        instagram.likePosts();

        if (instagram instanceof InstagramReels) {
            System.out.println("This is an instance of InstagramReels.");
            InstagramReels reels = (InstagramReels) instagram;
            reels.photos(); // accessing subclass-specific method
        }
    }
}
