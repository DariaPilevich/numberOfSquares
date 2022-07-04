package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void calcSquaresTest(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
