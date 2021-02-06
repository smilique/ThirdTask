package com.epam.training.tasks.third.entities;

import java.util.ArrayList;

import java.util.List;


public class CubeObservable extends Cube implements Observable {

    private List<CubeObserver> observers = new ArrayList<>();
    private CubeObserver state;

    public CubeObservable(double x, double y, double z, double sideLength) {
        super(x, y, z, sideLength);
    }

    public CubeObservable(Point point, double sideLength) {
        super(point, sideLength);
    }

    public CubeObservable(double[] data) {
        super(data);
    }

    public CubeObserver getState() {
        return state;
    }

    public void setNewParams(double x, double y, double z, double sideLength) {
        super.setParams(x, y, z, sideLength);
        notifyObservers();
    }

    public void attachObserver(CubeObserver observer) {
        observers.add(observer);
        observer.addObservable(this);
    }

    public void detachObserver(CubeObserver observer) {
        observer.removeObservable(this);
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setObservers(List<CubeObserver> observers) {
        for (CubeObserver observer : observers) {
            observer.addObservable(this);
        }
        this.observers = observers;
    }

    public void removeObservers(List<CubeObserver> observers) {
        for (CubeObserver observer : observers) {
            observer.removeObservable(this);
        }
        this.observers.clear();
    }




}
