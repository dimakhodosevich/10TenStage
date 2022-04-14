package by.itstep.khodosevich.tenproject.task10;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task10.module.logic.NumberCounter.*;

public class TestNumberCounter {

    @Test
    public void testCountNumberInValuePositive() {
        int value = 223344;
        int number = 2;
        int expected = 2;
        int actual = countNumberInValue(value, number);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumberInValueWithOne() {
        int value = 1;
        int number = 1;
        int expected = 1;
        int actual = countNumberInValue(value, number);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCountNumberInValueWithZero() {
        int value = 0;
        int number = 2;
        int actual = countNumberInValue(value, number);
    }

    @Test(expected = RuntimeException.class)
    public void testCountNumberInValueWithNegativeSearchNumber() {
        int value = 342;
        int number = -1;
        int actual = countNumberInValue(value, number);
    }

}
