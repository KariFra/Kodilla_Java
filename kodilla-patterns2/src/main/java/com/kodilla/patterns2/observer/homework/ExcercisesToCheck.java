package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExcercisesToCheck implements VisibleContent {
    private final List<Notifier> notifications;
    private final List<String> exercises;
    private final String module;

    public ExcercisesToCheck(String module) {
        this.notifications = new ArrayList<>();
        this.exercises = new ArrayList<>();
        this.module = module;
    }

    public List<String> getMessages() {
        return exercises;
    }

    public String getModule() {
        return module;
    }

    public void makeAndSendExercise(String message){
        exercises.add(message);
        notifyMentor();
    }
    @Override
    public void assignStudent(Notifier notification) {
        notifications.add(notification);

    }

    @Override
    public void notifyMentor() {
        for (Notifier notifier : notifications) {
            notifier.notify(this);
        }
    }
}
