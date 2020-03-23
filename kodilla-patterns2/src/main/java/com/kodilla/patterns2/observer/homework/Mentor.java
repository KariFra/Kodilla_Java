package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverNotify {
    private final String mentorName;
    private int exerciseCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void notify(ExcercisesToCheck excercisesToCheck) {
        String exerciseFill = " exercise.";
        if(excercisesToCheck.getMessages().size()>1){
            exerciseFill = " exercises.";
        }
        System.out.println( mentorName+ " has to check new exercise in topic: "+ excercisesToCheck.getModule() +"\n" +
                              "in total: " + excercisesToCheck.getMessages().size() + exerciseFill);
        exerciseCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
