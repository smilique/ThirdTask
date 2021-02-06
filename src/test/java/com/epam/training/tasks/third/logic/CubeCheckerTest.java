package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import com.epam.training.tasks.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class CubeCheckerTest {

    private final CubeChecker CUBE_CHECKER = new CubeChecker();

    @Test
    public void testCubeCheckerShouldDetectCubeWhenCubeApplied() {

        //given

        //when
        boolean actual = CUBE_CHECKER.isCube(new Cube(1,2,3,4));

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeCheckerShouldNotDetectCubeWhenPointApplied() {

        //given

        //when
        boolean actual = CUBE_CHECKER.isCube(new Point(1,2,3));

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testCubeCheckerShouldNotDetectCubeWhenObjectApplied() {

        //given

        //when
        boolean actual = CUBE_CHECKER.isCube(new Object());

        //then
        Assert.assertFalse(actual);
    }
}
