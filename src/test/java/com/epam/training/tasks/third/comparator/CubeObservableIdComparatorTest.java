package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.junit.Assert;
import org.junit.Test;

public class CubeObservableIdComparatorTest {

    private final CubeObservable firstCube = new CubeObservable(1,2,3,10);
    private final CubeObservable secondCube = new CubeObservable(2,4,6,8);
    private final CubeObservableIdComparator idComparator = new CubeObservableIdComparator();

    @Test
    public void testCubeObservableCompareByIdShouldReturnExpectedValueWhenFirstCubeIdSmaller() {
        //given
        int expected = -1;
        //when
        int actual = idComparator.compare(firstCube,secondCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeObservableCompareByIdShouldReturnExpectedValueWhenFirstCubeIdBigger() {
        //given
        int expected = 1;
        //when
        int actual = idComparator.compare(secondCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeObservableCompareByIdShouldReturnExpectedValueWhenCubeIdEquals() {
        //given
        int expected = 0;
        //when
        int actual = idComparator.compare(firstCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }
}