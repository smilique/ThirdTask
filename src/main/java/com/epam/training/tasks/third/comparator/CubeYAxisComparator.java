package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeYAxisComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeYAxisComparator.class);

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Double firstCubeId = firstCube.getY();
        Double secondCubeId = secondCube.getY();

        LOGGER.info("Comparing Cubes by Y axis position " + firstCubeId + " & " + secondCubeId);

        return firstCubeId.compareTo(secondCubeId);
    }
}
