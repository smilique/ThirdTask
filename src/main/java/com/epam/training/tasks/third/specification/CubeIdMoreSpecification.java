package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;

public class CubeIdMoreSpecification implements CubeSpecification {

    private final int compareId;

    public CubeIdMoreSpecification(int comparable) {
        compareId = comparable;
    }

    @Override
    public boolean specified(CubeObservable cube) {
        int cubeId = cube.getId();
        return cubeId > compareId;
    }
}
