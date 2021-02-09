package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeXAxisComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeXAxisComparator.class);

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Double firstCubeId = firstCube.getX();
        Double secondCubeId = secondCube.getX();

        LOGGER.info("Comparing Cubes by X axis position " + firstCubeId + " & " + secondCubeId);

        return firstCubeId.compareTo(secondCubeId);
    }
}
