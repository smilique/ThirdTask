package com.epam.training.tasks.third.repository;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeIdRangeSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CubeRepositoryTest {

    private final CubeRepository repository = new CubeRepository();

    private final CubeObservable TEST_CUBE = new CubeObservable(4,4,4,4);


    @Before
    public void init() {
        repository.addCube(new CubeObservable(1,2,3,3));
        repository.addCube(new CubeObservable(-1,0,3,4));
        repository.addCube(new CubeObservable(-3,-4,-5, 7));
    }


    @Test
    public void aTestCubeRepositoryShouldUpdateCubeParamsInRepositoryWhenNewParamsGiven() {

        //given
        double newSideLength = 5;
        repository.updateCube(new CubeObservable(2,4,4,4,newSideLength));
        CubeObservable repositoryCube = repository.getCube(2);

        //when
        double actual = repositoryCube.getSideLength();

        //then
        Assert.assertEquals(newSideLength,actual,0.1);

    }
    @Test
    public void bTestCubeRepositoryShouldAddCubeToRepositoryWhenCubeAdded() {

        //given
        repository.addCube(TEST_CUBE);
        int expected = 4;

        //when
        int actual = repository.size();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void cTestCubeRepositoryShouldRemoveCubeFromRepositoryWhenObjectGiven() {

        //given
        repository.removeCube(TEST_CUBE);
        int expected = 3;

        //when
        int actual = repository.size();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test //by id
    public void dTestCubeRepositoryShouldRemoveCubeFromRepositoryWhenCubeIdGiven() {

        //given
        repository.removeCube(14);
        int expected = 2;

        //when
        int actual = repository.size();

        //then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void eTestCubeRepositoryShouldCallIdRangeSpecificationWhenRequested() {
        //given
        List<CubeObservable> excepted = Arrays.asList(
                repository.getCube(18));

        //when
        List<CubeObservable> actual = repository.query(new CubeIdRangeSpecification(15,18));

        //then
        Assert.assertEquals(excepted,actual);

    }
}