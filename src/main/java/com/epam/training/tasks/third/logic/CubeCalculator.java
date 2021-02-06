package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;

public class CubeCalculator {



    public double getCubeVolume(Cube cube) {

        double sideLength = cube.getSideLength();

        return sideLength * sideLength * sideLength;
    }



    public double getCubeSurfaceArea(Cube cube) {

        double sideLength = cube.getSideLength();

        return sideLength * sideLength * 6;
    }

}
