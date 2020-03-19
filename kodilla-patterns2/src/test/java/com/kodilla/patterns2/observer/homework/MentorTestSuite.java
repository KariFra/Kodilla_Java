package com.kodilla.patterns2.observer.homework;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class MentorTestSuite {

    @Test
    public void notifyTest(){
        //Given
        ExcercisesToCheck aspect = new AspectOrientedProgrammingExercises();
        ExcercisesToCheck function = new FunctionalProgrammingExcercises();
        Mentor student1 = new Mentor("Benny Hill");
        Mentor student2 = new Mentor("John Cena");
        Mentor student3 = new Mentor("Dr. Sleep");
        aspect.assignStudent(student1);
        aspect.assignStudent(student2);
        function.assignStudent(student3);
        function.assignStudent(student2);
        //When
        aspect.makeAndSendExercise("Learn how to use @Transactional in Hibernate");
        function.makeAndSendExercise("Your first Stream");
        function.makeAndSendExercise("Use Optional in your collection");
        //Than
        assertEquals(1,student1.getExerciseCount());
        assertEquals(3,student2.getExerciseCount());
        assertEquals(2,student3.getExerciseCount());
    }



}