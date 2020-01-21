package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isExecuted;


    public DrivingTask(String taskName, String where, String using, boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        System.out.println("Your dog is healthy.");
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
