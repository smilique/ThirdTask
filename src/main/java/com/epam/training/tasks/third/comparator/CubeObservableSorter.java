package com.epam.training.tasks.third.comparator;


import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CubeObservableSorter {

    private static final Logger LOGGER = Logger.getLogger(CubeObservableSorter.class);

    private Comparator<CubeObservable> comparator;

    public List<CubeObservable> sortById(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube ID started");

        comparator = new CubeObservableIdComparator();

        return sortCubes(cubes,comparator);
    }

    public List<CubeObservable> sortByArea(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube surface area started");

        comparator = new CubeSurfaceAreaComparator();

        return sortCubes(cubes,comparator);
    }

    public List<CubeObservable> sortByVolume(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube volume started");

        comparator = new CubeVolumeComparator();

        return sortCubes(cubes,comparator);
    }

    public List<CubeObservable> sortByX(List<CubeObservable> cubes) {

        LOGGER.info("Sort by X axis position started");

        comparator = new CubeXAxisComparator();

        return sortCubes(cubes,comparator);
    }

    public List<CubeObservable> sortByY(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Y axis position started");

        comparator = new CubeYAxisComparator();

        return sortCubes(cubes,comparator);
    }

    public List<CubeObservable> sortByZ(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Z axis position started");

        comparator = new CubeZAxisComparator();

        return sortCubes(cubes,comparator);
    }

    private List<CubeObservable> sortCubes(List<CubeObservable> cubes,Comparator<CubeObservable> comparator) {

        List<CubeObservable> sortedCubes = new ArrayList<>(cubes);
        sortedCubes.sort(comparator);

        return sortedCubes;
    }
}
