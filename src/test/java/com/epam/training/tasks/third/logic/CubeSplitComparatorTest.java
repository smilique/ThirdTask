package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import org.junit.Assert;
import org.junit.Test;

import static com.epam.training.tasks.third.logic.Planes.*;

public class CubeSplitComparatorTest {

    private final CubeSplitComparator cubeSplitComparator = new CubeSplitComparator();

    @Test
    public void testCubeSplitComparatorShouldCompareVolumesWhenCubeSplitByYZ() {
        //given
        String expected = "YZ splits cube to 71,4% & 28,6%";

        //when
        String actual = cubeSplitComparator.split(new Cube(-5,2,3,7),YZ);

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeSplitComparatorShouldCompareVolumesWhenCubeSplitByZX() {
        //given
        String expected = "ZX splits cube to 71,4% & 28,6%";

        //when
        String actual = cubeSplitComparator.split(new Cube(3,-5,2,7),ZX);

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeSplitComparatorShouldCompareVolumesWhenCubeSplitByXY() {

        //given
        String expected = "XY splits cube to 71,4% & 28,6%";

        //when
        String actual = cubeSplitComparator.split(new Cube(2,3,-5,7),XY);

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeSplitComparatorShouldNotCompareVolumesWhenCubeOutsideYZ() {

        //given
        String expected = "YZ split not found";

        //when
        String actual = cubeSplitComparator.split(new Cube(5,2,3,7),YZ);

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeSplitComparatorShouldNotCompareVolumesWhenCubeOutsideXY() {

        //given
        String expected = "XY split not found";

        //when
        String actual = cubeSplitComparator.split(new Cube(5,2,3,7),XY);

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeSplitComparatorShouldNotCompareVolumesWhenCubeOutsideZX() {

        //given
        String expected = "ZX split not found";

        //when
        String actual = cubeSplitComparator.split(new Cube(5,2,3,7),ZX);

        //then
        Assert.assertEquals(expected,actual);

    }

}
