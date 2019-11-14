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
        this.userNumber = userNumber;
        this.postNumber = postNumber;
        this.commentNumber = commentNumber;
    }


    public boolean calculateAdvStatistics(Statistics statistics){
        boolean result = false;
        List<String> usersNames = new ArrayList<String>();
        userNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();
        avPostPerUser = postNumber/= userNumber;
        avCommentPerUser = commentNumber/= userNumber;
        avCommentPerPost = postNumber/= commentNumber;
        if(avPostPerUser*userNumber == commentNumber*avCommentPerPost){
            result = true;
        }

        System.out.println(userNumber+postNumber +commentNumber +avPostPerUser +avCommentPerUser+avCommentPerPost);

        return result;

    }

}
