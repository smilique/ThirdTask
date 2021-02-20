package com.epam.training.tasks.third.comparator;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class CubeVolumeComparator implements Comparator<CubeObservable> {

    private static Logger LOGGER = Logger.getLogger(CubeVolumeComparator.class);
    private final CubeCalculator calculator = new CubeCalculator();

    @Override
    public int compare(CubeObservable firstCube, CubeObservable secondCube) {

        Double firstVolume = calculator.getCubeVolume(firstCube);
        Double secondVolume = calculator.getCubeVolume(secondCube);

        LOGGER.info("Comparing Cubes by volume: " + firstVolume + " & " + secondVolume);

        return firstVolume.compareTo(secondVolume);
    }
}
