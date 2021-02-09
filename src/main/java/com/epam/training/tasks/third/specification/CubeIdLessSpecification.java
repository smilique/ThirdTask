package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeSpecification;

public class CubeIdLessSpecification implements CubeSpecification {

    private final int compareId;

    public CubeIdLessSpecification(int comparable) {
        compareId = comparable;
    }

    @Override
    public boolean specified(CubeObservable cube) {
        int cubeId = cube.getId();
        return cubeId < compareId;
    }
}
