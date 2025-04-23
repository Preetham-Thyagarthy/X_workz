package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.instagram.Instagram;
import com.xworkz.inheritence.internal.instagram.InstagramPosts;
import com.xworkz.inheritence.internal.instagram.InstagramReels;

public class InstagramRunner {
    public static void main(String[] args) {

        Instagram instagram = new Instagram();
        instagram.postPhoto();
        instagram.sendMessage();
        instagram.followUsers();
        instagram.viewStories();
        instagram.likePosts();
        System.out.println("**************************************");
        Instagram insta = new InstagramReels();
        insta.postPhoto();
        insta.sendMessage();
        insta.followUsers();
        insta.viewStories();
        insta.likePosts();

        System.out.println("**************************************");
        InstagramReels reels = new InstagramReels();
        reels.postPhoto();
        reels.sendMessage();
        reels.followUsers();
        reels.viewStories();
        reels.likePosts();

        System.out.println("************Casting example**************");
        InstagramPosts instagramPosts=new InstagramPosts();
        instagramPosts.opening(instagram);
        instagramPosts.opening(insta);
        instagramPosts.opening(reels);

    }
}
