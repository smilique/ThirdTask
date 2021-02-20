package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;

public class CubeVolumeMoreSpecification implements CubeSpecification{

    private final double compareVolume;

    public CubeVolumeMoreSpecification(int comparable) {
        compareVolume = comparable;
    }

    @Override
    public boolean specified(CubeObservable cube) {

        CubeCalculator calculator = new CubeCalculator();

        double cubeVolume = calculator.getCubeVolume(cube);
        return cubeVolume > compareVolume;
    }
}
