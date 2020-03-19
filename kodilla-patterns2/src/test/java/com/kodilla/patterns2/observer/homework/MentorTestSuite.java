package com.kodilla.patterns2.observer.homework;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class MentorTestSuite {

    @Test
    public void notifyTest(){
        //Given
        ExcercisesToCheck aspect = new AspectOrientedProgrammingExercises();
        ExcercisesToCheck function = new FunctionalProgrammingExcercises();
        Mentor mentor1 = new Mentor("Benny Hill");
        Mentor mentor2 = new Mentor("John Cena");
        Mentor mentor3 = new Mentor("Dr. Sleep");
        aspect.assignStudent(mentor1);
        aspect.assignStudent(mentor2);
        function.assignStudent(mentor3);
        function.assignStudent(mentor2);
        //When
        aspect.makeAndSendExercise("Learn how to use @Transactional in Hibernate");
        function.makeAndSendExercise("Your first Stream");
        function.makeAndSendExercise("Use Optional in your collection");
        //Than
        assertEquals(1,mentor1.getExerciseCount());
        assertEquals(3,mentor2.getExerciseCount());
        assertEquals(2,mentor3.getExerciseCount());
    }



}