package com.xworkz.facebook;

import com.xworkz.facebook.facebookpage.FacebookPage;

public class FacebookRunner {
    public static void main(String[] args) {
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.createProfile();
        facebookPage.postStatus();
        facebookPage.messageFriends();

        Facebook facebook = new Facebook();
        facebook.createProfile();
        facebook.postStatus();
        facebook.messageFriends();
    }
}
