package com.kodilla.patterns.factory.tasks;

public class TaskFactory {


    enum PossibleTasks { PAINTING(false ),SHOPPING(false),DRIVING(false);

        boolean wasDone;

        PossibleTasks(boolean wasDone) {
            this.wasDone = wasDone;
        }
    }

    public final Task taskTracker(final PossibleTasks possibleTasks){
        switch (possibleTasks){
            case PAINTING:
                PossibleTasks.PAINTING.wasDone = true;
                return new PaintingTask("Home makeover","Green","Walls");

            case SHOPPING:
                PossibleTasks.SHOPPING.wasDone = true;
                return new ShoppingTask("Weekend shopping","Eggs",20.00);

            case DRIVING:
                PossibleTasks.DRIVING.wasDone = true;
                return new DrivingTask("Take dog to vet","Green Street","Snowboard");

            default:
                return null;
        }
    }
}
