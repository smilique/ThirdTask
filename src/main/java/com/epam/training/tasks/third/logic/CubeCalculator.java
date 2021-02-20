package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import org.apache.log4j.Logger;

public class CubeCalculator {

    private static final Logger LOGGER = Logger.getLogger(CubeCalculator.class);

    public double getCubeVolume(Cube cube) {

        LOGGER.info("Calculating Cube volume");

        double sideLength = cube.getSideLength();

        return sideLength * sideLength * sideLength;
    }



    public double getCubeSurfaceArea(Cube cube) {

        LOGGER.info("Calculating Cube surface area");

        double sideLength = cube.getSideLength();

        return sideLength * sideLength * 6;
    }


}
