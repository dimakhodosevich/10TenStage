package by.itstep.khodosevich.tenproject.task02;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task02.module.logic.SameOneNumber.*;

public class TestSameOneNumber {
    public static final int notSameNumber;
    public static final int isSameNumber;
    public static final int notSameNumberNegative;
    public static final int isSameNumberNegative;
    public static final int oneNumber;
    public static String badMessage;


    static {
        notSameNumber = 12345;
        isSameNumber = 132341;
        notSameNumberNegative = -12345;
        isSameNumberNegative = -132341;
        oneNumber = 7;
        badMessage = "Your method works bad.";
    }

    @Test
    public void testCheckTheSameOneNumberPositive() {
        boolean actual = checkTheSameOneNumber(isSameNumber);
        assertTrue(badMessage, actual);
    }

    @Test
    public void testCheckTheSameOneNumberNegative() {
        boolean actual = checkTheSameOneNumber(notSameNumber);
        assertFalse(badMessage, actual);
    }

    @Test
    public void testCheckTheSameNegativeOneNumberPositive() {
        boolean actual = checkTheSameOneNumber(isSameNumberNegative);
        assertTrue(badMessage, actual);
    }

    @Test
    public void testCheckTheSameOneNegativeNumberNegative() {
        boolean actual = checkTheSameOneNumber(notSameNumberNegative);
        assertFalse(badMessage, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckTheSameOneNumberWithOneNumber() {
        checkTheSameOneNumber(oneNumber);
    }
}
