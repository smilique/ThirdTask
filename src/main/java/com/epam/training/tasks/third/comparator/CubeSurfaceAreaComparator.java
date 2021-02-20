package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeSurfaceAreaComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeSurfaceAreaComparator.class);
    private final CubeCalculator calculator = new CubeCalculator();

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Double firstSurfaceArea = calculator.getCubeSurfaceArea(firstCube);
        Double secondSurfaceArea = calculator.getCubeSurfaceArea(secondCube);

        LOGGER.info("Comparing Cubes by surface areas: " + firstSurfaceArea + " & " + secondSurfaceArea);

        return firstSurfaceArea.compareTo(secondSurfaceArea);
    }


}
