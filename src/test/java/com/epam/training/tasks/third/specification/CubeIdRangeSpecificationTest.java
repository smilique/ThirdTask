package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeIdRangeSpecification;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CubeIdRangeSpecificationTest {


    final static CubeObservable cube = new CubeObservable(1,2,3,4);
     CubeIdRangeSpecification idSpecification;
    @Test
    public void aTestCubeSpecificationByIdShouldReturnTrueWhenCubeIdInRange() {

        //given
        idSpecification = new CubeIdRangeSpecification(1,1);

        //when
        boolean actual = idSpecification.specified(cube);

        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void bTestCubeSpecificationByIdShouldReturnFalseWhenCubeIdLowerThanRange() {

        //given
        idSpecification = new CubeIdRangeSpecification(4,4);

        //when
        boolean actual = idSpecification.specified(cube);

        //then
        Assert.assertFalse(actual);

    }

    @Test
    public void cTestCubeSpecificationByIdShouldReturnFalseWhenCubeIdHigherThanRange() {

        //given
        idSpecification = new CubeIdRangeSpecification(0,0);

        //when
        boolean actual = idSpecification.specified(cube);

        //then
        Assert.assertFalse(actual);

    }
}