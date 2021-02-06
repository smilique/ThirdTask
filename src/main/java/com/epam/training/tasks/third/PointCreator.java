package com.epam.training.tasks.third;

import com.epam.training.tasks.third.data.DataParser;
import com.epam.training.tasks.third.data.DataReader;
import com.epam.training.tasks.third.data.DataReaderException;
import com.epam.training.tasks.third.data.PointDataValidator;
import com.epam.training.tasks.third.entities.Cube;
import com.epam.training.tasks.third.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class PointCreator {

    private final DataReader dataReader;
    private final DataParser dataParser;
    private final PointDataValidator pointDataValidator;

    public PointCreator(DataReader dataReader, DataParser dataParser, PointDataValidator pointDataValidator) {
        this.dataReader = dataReader;
        this.dataParser = dataParser;
        this.pointDataValidator = pointDataValidator;
    }

    public List<Point> create (String filename) throws DataReaderException {


        List<Point> result = new ArrayList<>();

        List<String> fileData = dataReader.read(filename);

        for (String line : fileData) {
            double[] parseData = dataParser.parse(line);

            if (pointDataValidator.validate(parseData)) {
                result.add(new Point(parseData));
            }
        }

        return result;
    }
}
