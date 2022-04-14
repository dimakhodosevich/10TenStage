package by.itstep.khodosevich.tenproject.task07;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task07.module.logic.NonParityNumber.*;

public class TestNonParityNumber {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your method works bad!!!\n";
    }


    @Test
    public void testCheckNonParityNumberPositive() {
        int actual_number = 1357;
        boolean actual = checkNonParityNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testCheckNonParityNumberNegative() {
        int actual_number = 1257;
        boolean actual = checkNonParityNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test
    public void testCheckNonParityNumberWithOneNumberPositive() {
        int actual_number = 7;
        boolean actual = checkNonParityNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testCheckNonParityNumberWithOneNumberNegative() {
        int actual_number = 8;
        boolean actual = checkNonParityNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckNonParityNumberWithZero() {
        int actual_number = 0;
        checkNonParityNumber(actual_number);
    }


}
