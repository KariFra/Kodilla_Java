package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted;


    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping was done");
        isTaskExecuted();
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
