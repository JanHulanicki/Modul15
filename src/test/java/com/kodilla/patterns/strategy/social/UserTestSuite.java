package com.kodilla.patterns.strategy.social;
import org.junit.Assert;
import org.junit.Test;
public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links",new SnapchatPublisher());
        User john = new YGeneration("John Hemerald",new TwitterPublisher());
        User kodilla = new ZGeneration("Kodilla",new FacebookPublisher());
        //When
        String stevenShouldPub = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPub);
        String johnShouldPub = john.sharePost();
        System.out.println("John should: " + johnShouldPub);
        String kodillaShouldPub = kodilla.sharePost();
        System.out.println("Kodilla should: " + kodillaShouldPub);
        //Then
        Assert.assertEquals("[SnapchatPublisher] published in snapchat", stevenShouldPub);
        Assert.assertEquals("[TwitterPublisher] published in twitter", johnShouldPub);
        Assert.assertEquals("[FacebookPublisher] published in facebook", kodillaShouldPub);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links",new SnapchatPublisher());
        //When
        String stevenShouldPub = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPub);
        steven.socialPublisher=new FacebookPublisher();
        stevenShouldPub = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldPub);
        //Then
        Assert.assertEquals("[FacebookPublisher] published in facebook", stevenShouldPub);
    }
}
