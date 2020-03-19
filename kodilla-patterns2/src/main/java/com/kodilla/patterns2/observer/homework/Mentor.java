package com.kodilla.patterns2.observer.homework;

public class Mentor implements Notifier {
    private final String studentName;
    private int exerciseCount;

    public Mentor(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void notify(ExcercisesToCheck excercisesToCheck) {
        System.out.println( studentName+ "send new exercise in topic: "+ excercisesToCheck.getModule() +"\n" +
                              "in total: " + excercisesToCheck.getMessages().size() + " exercise/s.");
        exerciseCount++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
