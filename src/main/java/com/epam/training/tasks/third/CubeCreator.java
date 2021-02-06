package com.epam.training.tasks.third;

import com.epam.training.tasks.third.data.CubeDataValidator;
import com.epam.training.tasks.third.data.DataParser;
import com.epam.training.tasks.third.data.DataReader;
import com.epam.training.tasks.third.data.DataReaderException;
import com.epam.training.tasks.third.entities.Cube;

import java.util.ArrayList;
import java.util.List;

public class CubeCreator {

    private final DataReader dataReader;
    private final DataParser dataParser;
    private final CubeDataValidator cubeDataValidator;

    public CubeCreator(DataReader dataReader, DataParser dataParser, CubeDataValidator cubeDataValidator) {
        this.dataReader = dataReader;
        this.dataParser = dataParser;
        this.cubeDataValidator = cubeDataValidator;
    }

    public List<Cube> create(String filename) throws DataReaderException {

        List<Cube> result = new ArrayList<>();
        List<String> fileData = dataReader.read(filename);

        for (String line : fileData) {
            double[] parseData = dataParser.parse(line);

            if (cubeDataValidator.validate(parseData)) {
                result.add(new Cube(parseData));
            }
        }

        return result;
    }
}
