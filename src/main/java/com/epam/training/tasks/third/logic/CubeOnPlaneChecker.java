package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import org.apache.log4j.Logger;

public class CubeOnPlaneChecker {

    private static final Logger LOGGER = Logger.getLogger(CubeOnPlaneChecker.class);

    public boolean isOnXy(Cube cube) {

        LOGGER.info("Checking Cube lying on XY plane");

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getZ() == side;
        boolean checkStartPoint = cube.getZ() == 0;

        return checkStartPoint || checkEndPoint;
    }

    public boolean isOnYz(Cube cube) {

        LOGGER.info("Checking Cube lying on YZ plane");

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getX() == side;
        boolean checkStartPoint = cube.getX() == 0;

        return checkStartPoint || checkEndPoint;
    }

    public boolean isOnZx(Cube cube) {

        LOGGER.info("Checking Cube lying on ZX plane");

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getY() == side;
        boolean checkStartPoint = cube.getY() == 0;

        return checkStartPoint || checkEndPoint;
    }

}
