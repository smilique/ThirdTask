package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CubeObservableSorterTest {

    private final CubeObservableSorter sorter = new CubeObservableSorter();

    private final CubeObservable FIRST_CUBE = new CubeObservable(1,2,3,1);
    private final CubeObservable SECOND_CUBE = new CubeObservable(2,4,6,2);
    private final CubeObservable THIRD_CUBE = new CubeObservable(3,6,9,3);
    private final CubeObservable FOURTH_CUBE = new CubeObservable(4,8,12,4);

    private final List<CubeObservable> expected = Arrays.asList(FIRST_CUBE,SECOND_CUBE,THIRD_CUBE,FOURTH_CUBE);
    private final List<CubeObservable> unsortedCubes = Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE);

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedById() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortById(unsortedCubes);
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedByArea() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortByArea(Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE));
        //then
        Assert.assertEquals(expected,actual);



    }

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedByVolume() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortByVolume(Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE));
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedByX() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortByX(Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE));
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedByY() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortByY(Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE));
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCubeObservableSorterShouldReturnSortedListWhenSortedByZ() {

        //given

        //when
        List<CubeObservable> actual = sorter.sortByZ(Arrays.asList(THIRD_CUBE,SECOND_CUBE,FOURTH_CUBE,FIRST_CUBE));
        //then
        Assert.assertEquals(expected,actual);

    }
}