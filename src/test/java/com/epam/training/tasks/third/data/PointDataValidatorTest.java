package com.epam.training.tasks.third.data;

import org.junit.Assert;
import org.junit.Test;

public class PointDataValidatorTest {

    private final PointDataValidator pointDataValidator = new PointDataValidator();

    @Test
    public void testCubeDataValidatorShouldValidateDataWhenCorrectIntegerDataApplied() {

        //given

        //when
        boolean actual = pointDataValidator.validate(new double[] {12, 34, 5});

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeDataValidatorShouldNotValidateDataWhenMoreThanThreeNumbersSent() {

        //given

        //when
        boolean actual = pointDataValidator.validate(new double[] {1.2, 3.4, 5.0, 7.8});

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testCubeDataValidatorShouldNotValidateDataWhenLessThanThreeNumbersSent() {

        //given

        //when
        boolean actual = pointDataValidator.validate(new double[] {12, 34});

        //then
        Assert.assertFalse(actual);
    }

}
