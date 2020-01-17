package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.doneList.getTasks().add("Task1");
        board.inProgressList.getTasks().add("Task2");
        board.toDoList.getTasks().add("Task3");

        //Then
//        Assert.assertEquals("Task1",board.doneList.getTasks().toString());
//        Assert.assertEquals("Task2",board.inProgressList.getTasks().toString());
//        Assert.assertEquals("Task3",board.toDoList.getTasks().toString());
    }
}
