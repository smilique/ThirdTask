package com.epam.training.tasks.third.entities;

import com.epam.training.tasks.third.logic.CubeIdGenerator;
import org.apache.log4j.Logger;


import java.util.List;
import java.util.Objects;


public class CubeObservable extends Cube implements Observable {

    private static final Logger LOGGER = Logger.getLogger(CubeObservable.class);

    private List<CubeObserver> observers;
    private final CubeIdGenerator idGenerator = new CubeIdGenerator();
    private int id;


    public CubeObservable(double x, double y, double z, double sideLength) {
        super(x, y, z, sideLength);
        setId(this);
    }

    public CubeObservable(int id, double x, double y, double z, double sideLength) {
        super(x, y, z, sideLength);
        this.id = id;
    }

    public CubeObservable(Point point, double sideLength) {
        super(point, sideLength);
        setId(this);
    }

    public CubeObservable(double[] data) {
        super(data);
        setId(this);
    }

    private void setId (CubeObservable cube) {

        int id = idGenerator.getNewId();
        cube.id = id;
    }


    public int getId() {
        return this.id;
    }

    public void setNewParams(int id, double x, double y, double z, double sideLength) {

        super.setParams(x, y, z, sideLength);
        notifyObservers();
    }

    public void attachObserver(CubeObserver observer) {
        LOGGER.info("Attaching Observer");
        observers.add(observer);
    }

    public void detachObserver(CubeObserver observer) {
        LOGGER.info("Detaching Observer");
        observers.remove(observer);
    }

    public void notifyObservers() {
        LOGGER.info("Notifying all Observers");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "CubeObservable{" +
                "id=" + id +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CubeObservable that = (CubeObservable) object;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
