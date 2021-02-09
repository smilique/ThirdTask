package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;

public class CubeAreaRangeSpecification implements CubeSpecification {


    private final int fromValue;
    private final int toValue;

    public CubeAreaRangeSpecification(int fromValue, int toValue) {
        this.fromValue = fromValue;
        this.toValue = toValue;
    }


    @Override
    public boolean specified(CubeObservable cube) {

        CubeCalculator calculator = new CubeCalculator();
        double currentSurfaceArea = calculator.getCubeSurfaceArea(cube);

        return (currentSurfaceArea >= fromValue && currentSurfaceArea <= toValue);
    }
}
