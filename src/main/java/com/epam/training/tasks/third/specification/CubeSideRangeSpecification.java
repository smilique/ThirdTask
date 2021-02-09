package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.specification.CubeSpecification;

public class CubeSideRangeSpecification implements CubeSpecification {


    private final int fromValue;
    private final int toValue;

    public CubeSideRangeSpecification(int fromValue, int toValue) {
        this.fromValue = fromValue;
        this.toValue = toValue;
    }


    @Override
    public boolean specified(CubeObservable cube) {

        double currentSideLength = cube.getSideLength();

        return (currentSideLength >= fromValue && currentSideLength <= toValue);
    }
}
