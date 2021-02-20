package com.epam.training.tasks.third.entities;

import com.epam.training.tasks.third.logic.CubeCalculator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;



public class CubeObserver implements Observer{

    private static final Logger LOGGER = Logger.getLogger(CubeObserver.class);

    private static CubeObserver instance = getInstance();

    private final CubeCalculator cubeCalculator = new CubeCalculator();
    private final Map<Integer,CubeParameters> cubeMap = new HashMap<>();

    private static CubeObserver getInstance() {
        if (instance == null) {
            instance = new CubeObserver();
        }
        return instance;
    }

    public CubeParameters getParameters(int cubeId) {

        return cubeMap.get(cubeId);

    }

    public void update(CubeObservable cube) {
        double area = cubeCalculator.getCubeSurfaceArea(cube);
        double volume = cubeCalculator.getCubeVolume(cube);
        CubeParameters parameters = new CubeParameters(area, volume);
        int cubeId = cube.getId();

        LOGGER.info("Updating Observable " + cubeId);

        cubeMap.put(cubeId, parameters);
    }

    public void addObservable(CubeObservable cube) {
        double area = cubeCalculator.getCubeSurfaceArea(cube);
        double volume = cubeCalculator.getCubeVolume(cube);
        CubeParameters parameters = new CubeParameters(area, volume);
        int cubeId = cube.getId();

        LOGGER.info("Adding Observable " + cubeId);

        cubeMap.put(cubeId,parameters);
    }

    public void removeObservable(CubeObservable cube) {

        int cubeId = cube.getId();

        LOGGER.info("Removing Observable " + cubeId);

        cubeMap.remove(cubeId);

    }

    public int getSize() {
        return cubeMap.size();
    }

}
