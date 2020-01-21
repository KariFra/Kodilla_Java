package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {

    public final static String PAINTING = "PAINTING";
    public final static String SHOPPING = "SHOPPING";
    public final static String DRIVING = "DRIVING";
    public static List<PaintingTask> donePaintingTasks = new ArrayList<>();
    public static List<ShoppingTask> doneShoppingTasks = new ArrayList<>();
    public static List<DrivingTask> doneDrivingTasks = new ArrayList<>();


    public final Task taskTracker(final String possibleTasks){
        switch (possibleTasks){
            case PAINTING:
                PaintingTask taskOnePainting = new PaintingTask("Home makeover","Green","Walls");
                donePaintingTasks.add(taskOnePainting);
                return taskOnePainting;

            case SHOPPING:
               ShoppingTask taskOneShopping = new ShoppingTask("Weekend shopping","Eggs",20.00);
                doneShoppingTasks.add(taskOneShopping);
                return taskOneShopping;

            case DRIVING:
                DrivingTask taskOneDriving = new DrivingTask("Take dog to vet","Green Street","Snowboard");
                doneDrivingTasks.add(taskOneDriving);
                return taskOneDriving;

            default:
                return null;
        }
    }
}
