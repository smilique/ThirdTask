package com.epam.training.tasks.third.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeObserverTest {

    private final CubeObserver observer = new CubeObserver();

    @Test
    public void addObservable() {

        int expected = 1;
        observer.addObservable(new CubeObservable(1,2,3,4));

        int actual = observer.getSize();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeObservable() {
    }

    @Test
    public void getParameters() {


    }

    @Test
    public void update() {
    }




}