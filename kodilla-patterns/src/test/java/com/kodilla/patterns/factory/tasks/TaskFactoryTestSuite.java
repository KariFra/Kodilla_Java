package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testExecutionPainting(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskTracker(TaskFactory.PossibleTasks.PAINTING);

        //Then
        Assert.assertEquals("Home makeover",task.getTaskName());
        Assert.assertEquals(true,task.isTaskExecuted());

    }
    @Test
    public void testExecutionShopping(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskTracker(TaskFactory.PossibleTasks.SHOPPING);

        //Then
        Assert.assertEquals("Weekend shopping",task.getTaskName());
        Assert.assertEquals(true,task.isTaskExecuted());
    }
    @Test
    public void testExecutionDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.taskTracker(TaskFactory.PossibleTasks.DRIVING);

        //Then
        Assert.assertEquals("Take dog to vet",task.getTaskName());
        Assert.assertEquals(true,task.isTaskExecuted());
    }
}
