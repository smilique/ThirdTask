package com.epam.training.tasks.third.data;

public class CubeDataValidator {

    public boolean validate (double[] data) {

        double sideLength = data[3];

        return data.length == 4 && sideLength > 0;

    }



}
