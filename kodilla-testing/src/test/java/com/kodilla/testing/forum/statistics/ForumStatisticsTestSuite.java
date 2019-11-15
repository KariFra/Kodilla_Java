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
   public void calculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = userGenerator(999);
        int postNumber = 1000;
        int commentNumber = 5;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        UserSpecification userSpecification = new UserSpecification(statisticsMock);

        //When
        String result = userSpecification.calculateAdvStatistics(statisticsMock);

        //Than
        Assert.assertEquals("1000, 1000, 5, 1.0, 0.0, 200.0",result);
    }
}
