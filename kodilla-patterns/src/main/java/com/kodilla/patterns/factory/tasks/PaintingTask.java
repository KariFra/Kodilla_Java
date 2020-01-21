package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;

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
        if (TaskFactory.donePaintingTasks.get(0).taskName == "Home makeover") {
            return true;
        }
        return false;
    }
}
