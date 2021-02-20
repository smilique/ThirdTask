package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;
import org.apache.log4j.Logger;


public class CubeSplitComparator {


    private final static Logger LOGGER = Logger.getLogger(CubeSplitComparator.class);
    private final CubeCalculator CUBE_CALCULATOR = new CubeCalculator();

    public String split(Cube cube, Planes plane) {

        LOGGER.info(plane + " plane split check will be realized");

        double axis = 0;
        switch (plane) {
            case XY: {
                axis = cube.getZ();
                break;
            }
            case YZ: {
                axis = cube.getX();
                break;
            }
            case ZX: {
                axis = cube.getY();
                break;
            }
            default: {
                break;
            }
        }

        double sideLength = cube.getSideLength();

        StringBuilder stringBuilder = new StringBuilder();

        if (axis < 0 && axis + sideLength > 0){

                stringBuilder.append(plane);
                stringBuilder.append(" splits cube to ");

                double cubeVolume = CUBE_CALCULATOR.getCubeVolume(cube);
                double firstVolume = Math.abs(axis * sideLength * sideLength);
                String volume = String.format("%.1f", firstVolume / cubeVolume * 100);
                stringBuilder.append(volume);
                stringBuilder.append("% & ");

                double secondVolume = (axis + sideLength) * sideLength * sideLength;
                volume = String.format("%.1f",secondVolume / cubeVolume * 100);
                stringBuilder.append(volume);
                stringBuilder.append("%");



        } else {
            stringBuilder.append(plane);
            stringBuilder.append(" split not found");
        }

        return stringBuilder.toString();
    }







}
