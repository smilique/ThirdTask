package com.epam.training.tasks.third.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeObserverTest {

    private final CubeObserver observer = new CubeObserver();

    private final CubeObservable TEST_CUBE = new CubeObservable(1,2,3,4);

    @Before
    public void init() {
        observer.addObservable(TEST_CUBE);
    }

    @Test
    public void testCubeObserverShouldAddObservableWhenAddObservableRequested() {

        //given
        int expected = 1;

        //when
        int actual = observer.getSize();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeObserverShouldRemoveObservableWhenRemoveObservableRequested() {

        //given
        int expected = 0;
        observer.removeObservable(TEST_CUBE);

        //when
        int actual = observer.getSize();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeObserverShouldReturnParametersWhenGetParametersRequested() {

        //given
        int testCubeId = TEST_CUBE.getId();
        CubeParameters expected = new CubeParameters(96,64);

        //when
        CubeParameters actual = observer.getParameters(testCubeId);

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeObserverShouldUpdateObserverWhenUpdateRequested() {

        //given
        int testCubeId = TEST_CUBE.getId();
        CubeParameters expected = observer.getParameters(testCubeId);
        TEST_CUBE.setSideLength(5);
        observer.update(TEST_CUBE);

        //when
        CubeParameters actual = observer.getParameters(testCubeId);

        //then
        Assert.assertNotEquals(expected, actual);

    }




}