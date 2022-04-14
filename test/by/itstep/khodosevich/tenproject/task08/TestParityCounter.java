package by.itstep.khodosevich.tenproject.task08;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task08.module.logic.ParityCounter.*;

public class TestParityCounter {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your method works bad!!!";
    }

    @Test
    public void testCountParityNumberPositive() {
        int actual_number = 34567;
        int expected = 2;
        int actual = countParityNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountParityNumberNegative() {
        int actual_number = 3579;
        int expected = 0;
        int actual = countParityNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountParityNumberWithOneNumberPositive() {
        int actual_number = 3;
        int expected = 0;
        int actual = countParityNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountParityNumberWithOneNumberNegative() {
        int actual_number = 8;
        int expected = 1;
        int actual = countParityNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCountParityNumberWithZero() {
        int actual_number = 0;
        countParityNumber(actual_number);
    }
}
