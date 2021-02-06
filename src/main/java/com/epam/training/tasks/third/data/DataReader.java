package com.epam.training.tasks.third.data;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final String NUMERIC_PATTERN = "[-?\\d*[^a-zA-Z]\\s]+";
    private final static Logger LOGGER = Logger.getLogger(DataReader.class);

    public List<String> read (String filename) throws DataReaderException {

        LOGGER.info("FileReader.read started!");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            List<String> fileData = new ArrayList<>();
            while (reader.ready()) {

                String line = reader.readLine();
                LOGGER.info(line);
                if (line.matches(NUMERIC_PATTERN)) {
                    fileData.add(line);
                }
            }
            return fileData;
        }
        catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
            throw new DataReaderException(e.getMessage(), e);

        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {

                 throw new DataReaderException(e.getMessage(), e);

            }
        }


    }

}
