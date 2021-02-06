package com.epam.training.tasks.third.data;

import org.junit.Assert;
import org.junit.Test;

public class CubeDataValidatorTest {

    private final CubeDataValidator cubeDataValidator = new CubeDataValidator();

    @Test
    public void testCubeDataValidatorShouldValidateDataWhenCorrectIntegerDataApplied() {

        //given

        //when
        boolean actual = cubeDataValidator.validate(new double[] {12, 34, 5, 78});

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeDataValidatorShouldValidateDataWhenCorrectFloatingPointDataApplied() {

        //given

        //when
        boolean actual = cubeDataValidator.validate(new double[] {1.2, 3.4, 5.0, 7.8});

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeDataValidatorShouldNotValidateDataWhenNegativeIntegerSideLengthApplied() {

        //given

        //when
        boolean actual = cubeDataValidator.validate(new double[] {12, 34, 5, -78});

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testCubeDataValidatorShouldValidateDataWhenNegativeFloatingPointSideLengthApplied() {

        //given

        //when
        boolean actual = cubeDataValidator.validate(new double[] {1.2, 3.4, 5.0, -7.8});

        //then
        Assert.assertFalse(actual);
    }
}
