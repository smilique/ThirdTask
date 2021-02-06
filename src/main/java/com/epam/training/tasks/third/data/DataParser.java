package com.epam.training.tasks.third.data;

public class DataParser {

    public double[] parse(String data) {

        String[] inputArray = data.split("\\s+");
        double[] result = new double[inputArray.length];

        for (int i = 0; i < result.length; i++) {

            result[i] = Double.parseDouble(inputArray[i]);

        }

        return result;

    }
}
