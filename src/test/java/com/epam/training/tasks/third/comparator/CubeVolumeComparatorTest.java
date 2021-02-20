package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.junit.Assert;
import org.junit.Test;


public class CubeVolumeComparatorTest {

    private final CubeObservable firstCube = new CubeObservable(1,2,3,8);
    private final CubeObservable secondCube = new CubeObservable(2,4,6,10);
    private final CubeVolumeComparator volumeComparator = new CubeVolumeComparator();

    @Test
    public void testCubeVolumeComparatorShouldReturnExpectedValueWhenFirstCubeAreaLess() {
        //given
        int expected = -1;
        //when
        int actual = volumeComparator.compare(firstCube,secondCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeVolumeComparatorShouldReturnExpectedValueWhenFirstCubeAreaMore() {
        //given
        int expected = 1;
        //when
        int actual = volumeComparator.compare(secondCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCubeVolumeComparatorShouldReturnExpectedValueWhenCubesAreaEquals() {
        //given
        int expected = 0;
        //when
        int actual = volumeComparator.compare(firstCube,firstCube);
        //then
        Assert.assertEquals(expected,actual);
    }

}