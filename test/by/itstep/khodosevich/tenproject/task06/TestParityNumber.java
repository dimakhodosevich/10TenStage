package by.itstep.khodosevich.tenproject.task06;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task06.module.logic.ParityNumber.*;

public class TestParityNumber {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your method works bad!!!\n";
    }

    @Test
    public void testCheckParityNumberPositive() {
        int actual_number = 2468;
        boolean actual = checkParityNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testCheckParityNumberNegative() {
        int actual_number = 2168;
        boolean actual = checkParityNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckParityNumberWithZero() {
        int actual_number = 0;
        checkParityNumber(actual_number);
    }

    @Test
    public void testCheckParityNumberWithOneNumberPositive() {
        int actual_number = 8;
        boolean actual = checkParityNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testCheckParityNumberWithOneNumberNegative() {
        int actual_number = 7;
        boolean actual = checkParityNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }


}
