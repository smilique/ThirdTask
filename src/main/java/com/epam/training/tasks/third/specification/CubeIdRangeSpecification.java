package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeSpecification;
import org.apache.log4j.Logger;

public class CubeIdRangeSpecification implements CubeSpecification {

    private static final Logger LOGGER = Logger.getLogger(CubeIdRangeSpecification.class);

    private final int fromId;
    private final int toId;

    public CubeIdRangeSpecification(int fromId, int toId) {
        this.fromId = fromId;
        this.toId = toId;
    }


    @Override
    public boolean specified(CubeObservable cube) {

        int currentCubeId = cube.getId();
        LOGGER.info("CubeIdRangeSpecification checking Cube id:" + currentCubeId);
        return (currentCubeId >= fromId && currentCubeId <= toId);
    }
}
