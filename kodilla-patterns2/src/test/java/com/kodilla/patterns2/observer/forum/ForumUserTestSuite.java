package com.kodilla.patterns2.observer.forum;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void updateTest(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivonne Escobar");
        ForumUser jeseePinkman = new ForumUser("Jesse Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jeseePinkman);
        javaToolsForum.registerObserver(jeseePinkman);

        //When
        javaHelpForum.addPost("Hallo everyone! Can you help me with for loop?");
        javaHelpForum.addPost("I am not sure how to use stream()...");
        javaToolsForum.addPost("Please tell me what is primary kay in SQL");
        javaHelpForum.addPost("I think you should use while in this case.");
        javaToolsForum.addPost("When I try to log in I got bad credentials message");

        //Than
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jeseePinkman.getUpdateCount());
    }



}