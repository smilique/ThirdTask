package com.epam.training.tasks.third.entities;

public interface Observable {

    void attachObserver(CubeObserver observer);
    void detachObserver(CubeObserver observer);
    void notifyObservers();

}
