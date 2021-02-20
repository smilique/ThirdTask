package com.epam.training.tasks.third.logic;

import com.epam.training.tasks.third.entities.Cube;

public class CubeChecker {

    public boolean isCube (Object object) {

        return object.getClass() == Cube.class;

    }

}
