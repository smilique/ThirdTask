package com.epam.training.tasks.third.entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeObservableTest {

    @Test
    public void testCubeObservableShouldAttachObserver() {
        //given
        CubeObservable cube = new CubeObservable(1,2,3,4);
        CubeObserver observer = new CubeObserver();
        observer.addObservable(cube);
        //when
        CubeObserver actual = cube.getState();
        //then

    }

    @Test
    public void detachObserver() {
    }

    @Test
    public void notifyObservers() {
    }
}