package by.itstep.khodosevich.tenproject.task09;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task09.module.logic.LinerSearch.*;

public class TestLinerSearch {

    @Test
    public void testGetMaxNumberPositive() {
        int actual_number = 34567;
        int expected = 7;
        int actual = getMaxNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMaxNumberWithOneNumber() {
        int actual_number = 7;
        int expected = 7;
        int actual = getMaxNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMaxNumberWithTheSameNumber() {
        int actual_number = 777;
        int expected = 7;
        int actual = getMaxNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMaxNumberWithOne() {
        int actual_number = 1;
        int expected = 1;
        int actual = getMaxNumber(actual_number);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetMaxNumberWithZero() {
        int actual_number = 0;
        getMaxNumber(actual_number);
    }

}
