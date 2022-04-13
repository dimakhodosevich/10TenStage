package by.itstep.khodosevich.tenproject.task01;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task01.module.logic.SameValue.*;

public class TestSameValue {

    public static final int oneNumber;
    public static final double sameValue;
    public static final double variousValue;
    public static final double sameValueNegative;
    public static final double variousValueNegative;
    public static String badMessage;

    static {
        badMessage = "Your method works bad!!!";
        variousValue = 23456723;
        sameValue = 777777777;
        variousValueNegative = 23456723;
        sameValueNegative = 777777777;
        oneNumber = 1;
    }

    @Test()
    public void testCheckTheSameValuePositive() {
        boolean actual = checkTheSameValue(sameValue);
        assertTrue(badMessage, actual);
    }

    @Test()
    public void testCheckTheSameValueNegative() {
        boolean actual = checkTheSameValue(variousValue);
        assertFalse(badMessage, actual);
    }

    @Test()
    public void testCheckTheSameNegativeValuePositive() {
        boolean actual = checkTheSameValue(sameValueNegative);
        assertTrue(badMessage, actual);
    }

    @Test()
    public void testCheckTheSameNegativeValueNegative() {
        boolean actual = checkTheSameValue(variousValueNegative);
        assertFalse(badMessage, actual);
    }


    @Test(expected = RuntimeException.class)
    public void testCheckTheSameValueWithOneNumberInValue() {
        boolean actual = checkTheSameValue(oneNumber);
        assertTrue(badMessage, actual);
    }

}
