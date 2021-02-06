package com.epam.training.tasks.third.entities;

import com.epam.training.tasks.third.logic.CubeCalculator;

import java.util.Map;



public class CubeObserver implements Observer{
    private static CubeObserver instance;
    private CubeCalculator cubeCalculator;
    private Map<Integer,CubeParameters> cubeMap;

    private static CubeObserver getInstance() {
        if (instance == null) {
            instance = new CubeObserver();
        }
        return instance;
    }

    public void update(CubeObservable cube) {
        double area = cubeCalculator.getCubeSurfaceArea(cube);
        double volume = cubeCalculator.getCubeVolume(cube);
        CubeParameters parameters = new CubeParameters(area, volume);
        cubeMap.put(cube.hashCode(), parameters); //WHAT'S GETID in cubeMap.put(cube.getID, parameters);?
    }

    public void addObservable(CubeObservable cube) {
        double area = cubeCalculator.getCubeSurfaceArea(cube);
        double volume = cubeCalculator.getCubeVolume(cube);
        CubeParameters parameters = new CubeParameters(area, volume);
        cubeMap.put(cube.hashCode(),parameters);
    }

    public void removeObservable(CubeObservable cube) {

        cubeMap.remove(cube.hashCode());

    }

}
