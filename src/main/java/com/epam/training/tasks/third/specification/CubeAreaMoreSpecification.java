package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;

public class CubeAreaMoreSpecification implements CubeSpecification{

    private final double compareArea;

    public CubeAreaMoreSpecification(int comparable) {
        compareArea = comparable;
    }

    @Override
    public boolean specified(CubeObservable cube) {

        CubeCalculator calculator = new CubeCalculator();

        double cubeSurfaceArea = calculator.getCubeSurfaceArea(cube);

        return cubeSurfaceArea > compareArea;
    }
}
