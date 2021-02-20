package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.junit.Assert;
import org.junit.Test;


public class CubeSurfaceAreaComparatorTest {

    private final CubeObservable firstCube = new CubeObservable(1,2,3,8);
    private final CubeObservable secondCube = new CubeObservable(2,4,6,10);
    private final CubeSurfaceAreaComparator surfaceComparator = new CubeSurfaceAreaComparator();

    @Test
    public void testCubeSurfaceAreaComparatorShouldReturnExpectedValueWhenFirstCubeAreaLess() {
        //given
        int expected = -1;
        //when
        int actual = surfaceComparator.compare(firstCube,secondCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeSurfaceAreaComparatorShouldReturnExpectedValueWhenFirstCubeAreaMore() {
        //given
        int expected = 1;
        //when
        int actual = surfaceComparator.compare(secondCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeSurfaceAreaComparatorShouldReturnExpectedValueWhenCubesAreaEquals() {
        //given
        int expected = 0;
        //when
        int actual = surfaceComparator.compare(firstCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }

}