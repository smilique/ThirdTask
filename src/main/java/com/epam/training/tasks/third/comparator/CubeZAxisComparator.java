package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeZAxisComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeZAxisComparator.class);

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Double firstCubeId = firstCube.getZ();
        Double secondCubeId = secondCube.getZ();

        LOGGER.info("Comparing Cubes by Z axis position " + firstCubeId + " & " + secondCubeId);

        return firstCubeId.compareTo(secondCubeId);
    }
}
