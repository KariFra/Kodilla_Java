package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExcercisesToCheck implements ObservableExercises {
    private final List<ObserverNotify> notifications;
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
    public void assignStudent(ObserverNotify notification) {
        notifications.add(notification);

    }

    @Override
    public void notifyMentor() {
        for (ObserverNotify observerNotify : notifications) {
            observerNotify.notify(this);
        }
    }
}
