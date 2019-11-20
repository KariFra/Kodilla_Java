package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private List<String> userGenerator (int numberOfUser){
        List<String> user = new ArrayList<>();
        for(int i=0; i<= numberOfUser; i++){
            user.add("User");
        }
        return user;
    }

    @Test
   public void calculateAdvStatisticsZeroCommentsAndHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(99);
        int postNumber = 1000;
        int commentNumber = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals(userSpecification.getUserNumber(), 100);
        Assert.assertEquals(userSpecification.getCommentNumber(), 0);
        Assert.assertEquals(userSpecification.getPostNumber(), 1000);
        Assert.assertEquals(userSpecification.getAvPostPerUser(), 10.0, 0.01);
        Assert.assertEquals(userSpecification.getAvCommentPerUser(), 0.0, 0.01 );
    }
    @Test
    public void calculateAdvStatisticsNoUser(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        int postNumber = 1000;
        int commentNumber = 5;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals(userSpecification.getUserNumber(), 0);
    }
    @Test
    public void calculateAdvStatisticsZeroPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(4);
        int postNumber = 0;
        int commentNumber = 5;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals(userSpecification.getPostNumber(), 0);

    }
    @Test
    public void calculateAdvStatisticsMorePosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(9);
        int postNumber = 10;
        int commentNumber = 5;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals(userSpecification.getAvCommentPerPost(), 2.0, 0.1);
    }
    @Test
    public void calculateAdvStatisticsMoreComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(19);
        int postNumber = 20;
        int commentNumber = 40;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals(userSpecification.getUserNumber(), 20);
        Assert.assertEquals(userSpecification.getCommentNumber(), 40);
        Assert.assertEquals(userSpecification.getPostNumber(), 20);
        Assert.assertEquals(userSpecification.getAvPostPerUser(), 1.0, 0.01);
        Assert.assertEquals(userSpecification.getAvCommentPerUser(), 2.0, 0.01 );
    }
}
