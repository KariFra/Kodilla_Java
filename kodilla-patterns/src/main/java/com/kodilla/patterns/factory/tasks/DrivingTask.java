package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;



    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;

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
        if (TaskFactory.doneDrivingTasks.get(0).taskName == "Take dog to vet") {
            return true;
        }
        return false;
    }
}
