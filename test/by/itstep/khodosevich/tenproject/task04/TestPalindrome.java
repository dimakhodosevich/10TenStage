package by.itstep.khodosevich.tenproject.task04;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task04.module.logic.Palindrome.*;

public class TestPalindrome {
    public static final int isPalendromeNumber;
    public static final int notPalendromeNumber;
    public static final int negativeNumber;
    public static final int oneNumber;
    public static String errorMessage;

    static {
        isPalendromeNumber = 12344321;
        notPalendromeNumber = 1234567;
        negativeNumber = -13235;
        oneNumber = 7;
        errorMessage = "Your method works bad!!!";
    }

    @Test
    public void testCheckPalindromePositive() {
        boolean actual = checkPalindrome(isPalendromeNumber);
        assertTrue(actual);
    }

    @Test
    public void testCheckPalindromeNegative() {
        boolean actual = checkPalindrome(notPalendromeNumber);
        assertFalse(actual);
    }

    @Test
    public void testCheckPalindromeWithOneNumber() {
        boolean actual = checkPalindrome(oneNumber);
        assertTrue(actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckPalindromeNegativeNumber() {
        checkPalindrome(negativeNumber);
    }

}

