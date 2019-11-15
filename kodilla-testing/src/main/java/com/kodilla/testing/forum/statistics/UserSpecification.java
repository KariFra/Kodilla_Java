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


    public String calculateAdvStatistics(Statistics statistics) {
        String result = "";
        userNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();
        if (userNumber != 0 && commentNumber != 0 && postNumber != 0){
            avPostPerUser = postNumber/userNumber;
            avCommentPerUser = commentNumber/userNumber;
            avCommentPerPost = postNumber/commentNumber;
            result = userNumber+", "+postNumber+", " +commentNumber+", " +avPostPerUser+", " +avCommentPerUser+", "+avCommentPerPost;
            System.out.println(userNumber+", "+postNumber+", " +commentNumber+", " +avPostPerUser+", " +avCommentPerUser+", "+avCommentPerPost);}
        if (userNumber == 0){
            result = "There are no users.";
            System.out.println("There are no users.");
        }
        if(commentNumber == 0 && postNumber != 0 && userNumber != 0){
            avPostPerUser = postNumber/userNumber;
            result = userNumber+", "+ postNumber+", "+avPostPerUser;
            System.out.println("There are "+userNumber+"and "+postNumber+"posts but there are no comments. The avarage post per user equals:"+avPostPerUser);
        }
        if(postNumber == 0 && commentNumber != 0 && userNumber != 0){
            avCommentPerUser = commentNumber/userNumber;
            result = userNumber+", "+ commentNumber+", "+avCommentPerUser;
            System.out.println( "There are "+userNumber+"and "+commentNumber+"comments but there are no posts. The avarage comment per user equals:"+avCommentPerUser);
        }
        if(postNumber == 0 && commentNumber == 0 && userNumber != 0){
            result =""+userNumber;
            System.out.println("There are "+userNumber+" users and no comments or posts.");
        }
        return result;
    }
}
