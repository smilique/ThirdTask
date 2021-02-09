package com.epam.training.tasks.third.comparator;


import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CubeObservableSorter {

    private static final Logger LOGGER = Logger.getLogger(CubeObservableSorter.class);

    private Comparator<CubeObservable> comparator;

    public List<CubeObservable> sortById(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube ID started");

        comparator = new CubeObservableIdComparator();
        List<CubeObservable> observableCubes = new ArrayList<>(cubes);
        Collections.sort(observableCubes, comparator);

        return observableCubes;
    }

    public List<CubeObservable> sortByArea(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube surface area started");

        comparator = new CubeSurfaceAreaComparator();
        List<CubeObservable> observableCubes = new ArrayList<>(cubes);
        Collections.sort(observableCubes, comparator);

        return observableCubes;
    }

    public List<CubeObservable> sortByVolume(List<CubeObservable> cubes) {

        LOGGER.info("Sort by Cube volume started");

        comparator = new CubeVolumeComparator();
        List<CubeObservable> observableCubes = new ArrayList<>(cubes);
        Collections.sort(observableCubes, comparator);

        return observableCubes;
    }
}
