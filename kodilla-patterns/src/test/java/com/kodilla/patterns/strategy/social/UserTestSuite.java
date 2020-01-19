package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jessica = new Millenials("Jessica Mordeczka");
        User brajan = new ZGeneration("Brajan Ziom");
        User seba = new YGeneration("Sebastian Stary");

        //When
        String millenialsPosts = jessica.sharePost();
        String zGenerationPosts = brajan.sharePost();
        String yGenerationPosts = seba.sharePost();

        //Then
        Assert.assertEquals("Facebook",millenialsPosts);
        Assert.assertEquals("Twitter",yGenerationPosts);
        Assert.assertEquals("Snapchat",zGenerationPosts);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jessica = new Millenials("Jessica Mordeczka");

        //When
        jessica.setSocialPublisher( new FacebookPublisher());
        String millenialsPosts = jessica.sharePost();

        //Then
        Assert.assertEquals("Facebook",millenialsPosts);
    }
}
