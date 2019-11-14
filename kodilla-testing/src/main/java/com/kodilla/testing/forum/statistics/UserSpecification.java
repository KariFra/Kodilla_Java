package com.kodilla.testing.forum.statistics;


import java.util.ArrayList;
import java.util.List;

public class UserSpecification{

    Statistics statistics;
    int userNumber;
    int postNumber;
    int commentNumber;
    double avPostPerUser;
    double avCommentPerUser;
    double avCommentPerPost;

    public UserSpecification(Statistics statistics) {
        this.statistics = statistics;

    }


    public boolean calculateAdvStatistics(Statistics statistics) {
        boolean result = false;
        userNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();
        while (userNumber != 0 && commentNumber != 0){
        avPostPerUser = postNumber/= userNumber;
        avCommentPerUser = commentNumber/= userNumber;
        avCommentPerPost = postNumber/= commentNumber;}

        System.out.println(userNumber+", "+postNumber+", " +commentNumber+", " +avPostPerUser+", " +avCommentPerUser+", "+avCommentPerPost);

        if(avPostPerUser*userNumber == commentNumber*avCommentPerPost){
            result = true;
        }
        return result;
    }
}
