package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;

public class CubeOnPlaneChecker {

    public boolean isOnXy(Cube cube) {

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getZ() == side;
        boolean checkStartPoint = cube.getZ() == 0;

        return checkStartPoint || checkEndPoint;
    }

    public boolean isOnYz(Cube cube) {

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getX() == side;
        boolean checkStartPoint = cube.getX() == 0;

        return checkStartPoint || checkEndPoint;
    }

    public boolean isOnZx(Cube cube) {

        double side = cube.getSideLength();
        boolean checkEndPoint = cube.getY() == side;
        boolean checkStartPoint = cube.getY() == 0;

        return checkStartPoint || checkEndPoint;
    }

}
