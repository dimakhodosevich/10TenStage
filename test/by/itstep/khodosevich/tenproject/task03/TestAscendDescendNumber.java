package by.itstep.khodosevich.tenproject.task03;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task03.module.logic.AscendDescendNumber.*;

public class TestAscendDescendNumber {

    public static final int isAscendNumber;
    public static final int notAscendNumber;
    public static final int isDescendNumber;
    public static final int notDescendNumber;
    public static final int oneNumber;
    public static final int sameNumber;
    public static String errorMessage;

    static {
        isAscendNumber = 123456;
        notAscendNumber = 123123;
        isDescendNumber = 654321;
        notDescendNumber = 654654;
        sameNumber = 7777777;
        oneNumber = 7;
        errorMessage = "Your method works bad!!!";
    }

    @Test
    public void testCheckAscendDescendNumberIsAscend() {
        boolean actual = checkAscendDescendNumber(isAscendNumber);
        assertTrue(errorMessage, actual);
    }

    @Test
    public void testCheckAscendDescendNumberNotAscend() {
        boolean actual = checkAscendDescendNumber(notAscendNumber);
        assertFalse(errorMessage, actual);
    }

    @Test
    public void testCheckAscendDescendNumberIsDescend() {
        boolean actual = checkAscendDescendNumber(isDescendNumber);
        assertTrue(errorMessage, actual);
    }

    @Test
    public void testCheckAscendDescendNumberNotDescend() {
        boolean actual = checkAscendDescendNumber(notDescendNumber);
        assertFalse(errorMessage, actual);
    }

    @Test
    public void testCheckAscendDescendNumberWithSameNumber() {
        boolean actual = checkAscendDescendNumber(sameNumber);
        assertFalse(errorMessage, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckAscendDescendNumberOneNumber() {
        checkAscendDescendNumber(oneNumber);
    }


}
