package com.kodilla.patterns.strategy.social;
public class ZGeneration extends User {
    public ZGeneration(String userName,SocialPublisher socialPublisher) {
        super(userName,socialPublisher);
        this.socialPublisher= new FacebookPublisher();
    }
}
