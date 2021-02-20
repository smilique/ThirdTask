package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeObservableIdComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeObservableIdComparator.class);

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Integer firstCubeId = firstCube.getId();
        Integer secondCubeId = secondCube.getId();

        LOGGER.info("Comparing Cubes by ID with " + firstCubeId + " & " + secondCubeId);

        return firstCubeId.compareTo(secondCubeId);
    }
}
