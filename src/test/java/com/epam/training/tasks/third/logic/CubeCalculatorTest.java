package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import org.junit.Assert;
import org.junit.Test;

public class CubeCalculatorTest {

    private final CubeCalculator cubeCalculator = new CubeCalculator();

    @Test
    public void testCubeCalculatorShouldCalculateCubeVolumeWhenIntegerNumbersApplied() {

        //given
        double expected = 64;

        //when
        double actual = cubeCalculator.getCubeVolume(new Cube(1,2,3,4));

        //then
        Assert.assertEquals(expected,actual,1);

    }

    @Test
    public void testCubeCalculatorShouldCalculateCubeVolumeWhenFloatingPointNumbersApplied() {

        //given
        double expected = 85.18;

        //when
        double actual = cubeCalculator.getCubeVolume(new Cube(1.1,2.2,3.3,4.4));

        //then
        Assert.assertEquals(expected,actual,2);

    }

    @Test
    public void testCubeCalculatorShouldCalculateCubeSurfaceAreaWhenIntegerNumbersApplied() {

        //given
        double expected = 96;

        //when
        double actual = cubeCalculator.getCubeSurfaceArea(new Cube(1,2,3,4));

        //then
        Assert.assertEquals(expected,actual,1);

    }

    @Test
    public void testCubeCalculatorShouldCalculateCubeSurfaceAreaWhenFloatingPointNumbersApplied() {

        //given
        double expected = 116.2;

        //when
        double actual = cubeCalculator.getCubeSurfaceArea(new Cube(1.1,2.2,3.3,4.4));

        //then
        Assert.assertEquals(expected,actual,1);

    }
}
