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
   public void calculateAdvStatisticsZeroCommentsandHundredUsers(){
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
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("100, 1000, 10.0",result);
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
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("There are no users.",result);
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
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("5, 5, 1.0",result);
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
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("10, 10, 5, 1.0, 0.0, 2.0",result);
    }
    @Test
    public void calculateAdvStatisticsMoreComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(9);
        int postNumber = 5;
        int commentNumber = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("10, 5, 10, 0.0, 1.0, 0.0",result);
    }
}
