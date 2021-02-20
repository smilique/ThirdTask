package com.epam.training.tasks.third.repository;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeSpecification;
import org.apache.log4j.Logger;

import java.util.*;

public class CubeRepository {

    private static final Logger LOGGER = Logger.getLogger(CubeRepository.class);

    private final Map<Integer, CubeObservable> repositoryCubes = new HashMap<>();


    public void addCube(CubeObservable cube) {
            int id = cube.getId();

            LOGGER.info("Cube with id " + id + " added to repository");
            repositoryCubes.put(id, cube);

    }

    public void removeCube(CubeObservable cube) {
            int id = cube.getId();
            LOGGER.info("Cube with id " + id + " deleted from repository");
            repositoryCubes.remove(id);

    }

    public void removeCube(int id) {

            CubeObservable removableCube = repositoryCubes.get(id);
            LOGGER.info("Cube with id " + id + " deleted from repository");
            repositoryCubes.remove(id,removableCube);
    }


    public void updateCube(CubeObservable cube) {
            int id = cube.getId();
            LOGGER.info("Cube with id " + id + " updated");
            repositoryCubes.replace(id, cube);

    }

    public CubeObservable getCube(int id) {
        return repositoryCubes.get(id);
    }

    public int size() {
            return repositoryCubes.size();
    }


    public List<CubeObservable> query(CubeSpecification specification) {

            List<CubeObservable> specifiedCubes = new ArrayList<>();

            for (CubeObservable cube : repositoryCubes.values()) {
                if (specification.specified(cube)) {
                    specifiedCubes.add(cube);
                }
            }

        return specifiedCubes;
    }

}
