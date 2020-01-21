package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {

    public final static String PAINTING = "PAINTING";
    public final static String SHOPPING = "SHOPPING";
    public final static String DRIVING = "DRIVING";


    public final Task taskTracker(final String possibleTasks){
        switch (possibleTasks){
            case PAINTING:
                return new PaintingTask("Home makeover","Green","Walls",true);

            case SHOPPING:
                return new ShoppingTask("Weekend shopping","Eggs",20.00, true);

            case DRIVING:
                return new DrivingTask("Take dog to vet","Green Street","Snowboard", true);

            default:
                return null;
        }
    }
}
