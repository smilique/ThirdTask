package com.epam.training.tasks.third.repository;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeSideRangeSpecification;
import org.junit.Assert;
import org.junit.Test;



public class CubeSideRangeSpecificationTest {

    final static CubeObservable cube = new CubeObservable(1,2,3,4);
    CubeSideRangeSpecification specification;
    @Test
    public void testCubeSpecificationBySideShouldReturnTrueWhenCubeIdInRange() {
        //given
        specification = new CubeSideRangeSpecification(3,4);
        //when
        boolean actual = specification.specified(cube);
        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void testCubeSpecificationBySideShouldReturnFalseWhenCubeIdLowerThanRange() {
        //given
        specification = new CubeSideRangeSpecification(5,7);
        //when
        boolean actual = specification.specified(cube);
        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void testCubeSpecificationBySideShouldReturnFalseWhenCubeIdHigherThanRange() {
        //given
        specification = new CubeSideRangeSpecification(0,1);
        //when
        boolean actual = specification.specified(cube);
        //then
        Assert.assertFalse(actual);

    }

}