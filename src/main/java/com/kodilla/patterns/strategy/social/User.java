package com.kodilla.patterns.strategy.social;
public class User {
    private String userName;
    protected  SocialPublisher socialPublisher;
    public User(String userName,SocialPublisher socialPublisher) {
        this.userName = userName;
        this.socialPublisher = socialPublisher;
    }
    public String getUserName() {
        return userName;
    }
    public String sharePost(){
        return socialPublisher.share();
    }
}
