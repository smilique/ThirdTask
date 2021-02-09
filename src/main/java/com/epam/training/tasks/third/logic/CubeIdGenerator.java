package com.epam.training.tasks.third.logic;


public class CubeIdGenerator {

    private static CubeIdGenerator instance = getInstance();

    private static int currentId = 1;

    private static CubeIdGenerator getInstance() {
        if (instance == null) {
            instance = new CubeIdGenerator();
        }
        return instance;
    }

    public int getNewId() {

        return currentId++;

    }
}
