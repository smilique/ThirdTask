package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;

public class CubeSideLessSpecification implements CubeSpecification{

    private final double compareSide;

    public CubeSideLessSpecification(int comparable) {
        compareSide = comparable;
    }

    @Override
    public boolean specified(CubeObservable cube) {
        double cubeSide = cube.getSideLength();
        return cubeSide < compareSide;
    }
}
