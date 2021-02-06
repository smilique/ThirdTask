package com.epam.training.tasks.third.data;


import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;


public class DataReaderTest {

    @Test
    public void testFileReaderShouldReadCorrectLinesFromFile() throws DataReaderException {

        //given
        DataReader dataReader = new DataReader();
        List<String> expected = Arrays.asList("3.0 2.5 3.0 5.0", "4 5 9 5", "0.5 -2.5 15 5", "1 2 3 -5");

        //when
        List<String> actual = dataReader.read("./src/test/resources/mixeddatainput.txt");

        //then
        Assert.assertEquals(expected, actual);
    }


}
