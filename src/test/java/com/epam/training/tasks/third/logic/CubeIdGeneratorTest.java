package com.epam.training.tasks.third.logic;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CubeIdGeneratorTest {

    private final CubeIdGenerator idGenerator = new CubeIdGenerator();

    @Test
    public void testCubeIdGeneratorShouldGenerateIdWhenIdForFirstTimeRequested() {

        //given
        int expected = 1;

        //when
        int actual = idGenerator.getNewId();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeIdGeneratorShouldGenerateNextIdWhenIdForSecondTimeRequested() {

        //given
        int expected = 2;

        //when
        int actual = idGenerator.getNewId();

        //then
        Assert.assertEquals(expected,actual);

    }
}