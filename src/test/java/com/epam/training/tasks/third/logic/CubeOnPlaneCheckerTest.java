package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import com.epam.training.tasks.third.logic.CubeOnPlaneChecker;
import org.junit.Assert;
import org.junit.Test;

public class CubeOnPlaneCheckerTest {

    private final CubeOnPlaneChecker cubeOnPlaneChecker = new CubeOnPlaneChecker();

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeStartsAtXY() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnXY(new Cube(1,2,0,3));
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeStartsAtZX() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnZX(new Cube(2,0,1,3));
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeStartsAtYZ() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnYZ(new Cube(0,1,2,3));
        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeEndsAtXY() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnXY(new Cube(1,2,3,3));
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeEndsAtZX() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnZX(new Cube(2,3,1,3));
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeOnPlaneShouldDetectCubeOnPlaneWhenCubeEndsAtYZ() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnYZ(new Cube(3,1,2,3));
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCubeOnPlaneShouldNotDetectCubeOnPlaneWhenCubeOutsideXY() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnXY(new Cube(1,2,4,3));
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testCubeOnPlaneShouldNotDetectCubeOnPlaneWhenCubeOutsideZX() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnZX(new Cube(2,4,1,3));
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testCubeOnPlaneShouldNotDetectCubeOnPlaneWhenCubeOutsideYZ() {
        //given

        //when
        boolean actual = cubeOnPlaneChecker.isOnYZ(new Cube(4,1,2,3));
        //then
        Assert.assertFalse(actual);
    }
}
