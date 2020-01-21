package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted;


    public PaintingTask(String taskName, String color, String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        System.out.println("The walls look like green peas.");
        isTaskExecuted();
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted){
            return true;
        }
        return false;
    }
}
