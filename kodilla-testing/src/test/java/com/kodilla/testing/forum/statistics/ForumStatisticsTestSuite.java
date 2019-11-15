package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {


    @Test
   public void calculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<>(100);
        int postNumber = 0;
        int commentNumber = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("There are no users.",result);
    }
}
