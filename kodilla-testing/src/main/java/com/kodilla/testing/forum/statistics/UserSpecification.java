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

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public double getAvPostPerUser() {
        return avPostPerUser;
    }

    public double getAvCommentPerUser() {
        return avCommentPerUser;
    }

    public double getAvCommentPerPost() {
        return avCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();
        if (userNumber != 0 && commentNumber != 0 && postNumber != 0){
            avPostPerUser = postNumber/userNumber;
            avCommentPerUser = commentNumber/userNumber;
            avCommentPerPost = postNumber/commentNumber;
            System.out.println(userNumber+", "+postNumber+", " +commentNumber+", " +avPostPerUser+", " +avCommentPerUser+", "+avCommentPerPost);}
        if (userNumber == 0){
            System.out.println("There are no users.");
        }
        if(commentNumber == 0 && postNumber != 0 && userNumber != 0){
            avPostPerUser = postNumber/userNumber;
            System.out.println("There are "+userNumber+" users and "+postNumber+" posts but there are no comments. The avarage post per user equals:"+avPostPerUser);
        }
        if(postNumber == 0 && commentNumber != 0 && userNumber != 0){
            avCommentPerUser = commentNumber/userNumber;
            System.out.println( "There are "+userNumber+" users and "+commentNumber+" comments but there are no posts. The avarage comment per user equals: "+avCommentPerUser);
        }
        if(postNumber == 0 && commentNumber == 0 && userNumber != 0){
            System.out.println("There are "+userNumber+" users and no comments or posts.");
        }
    }
}
