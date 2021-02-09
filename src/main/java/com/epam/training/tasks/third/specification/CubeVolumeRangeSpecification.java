package com.epam.training.tasks.third.specification;

import com.epam.training.tasks.third.entities.CubeObservable;
import com.epam.training.tasks.third.logic.CubeCalculator;

public class CubeVolumeRangeSpecification implements CubeSpecification {


    private final int fromValue;
    private final int toValue;

    public CubeVolumeRangeSpecification(int fromValue, int toValue) {
        this.fromValue = fromValue;
        this.toValue = toValue;
    }


    @Override
    public boolean specified(CubeObservable cube) {

        CubeCalculator calculator = new CubeCalculator();
        double currentVolume = calculator.getCubeVolume(cube);

        return (currentVolume >= fromValue && currentVolume <= toValue);
    }
}
