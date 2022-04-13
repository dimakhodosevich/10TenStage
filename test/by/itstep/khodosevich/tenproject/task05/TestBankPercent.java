package by.itstep.khodosevich.tenproject.task05;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task05.module.BankPercent.*;


public class TestBankPercent {

    public static double money;
    public static double mount;
    public static double percent;

    static {
        money = 10;
        mount = 1;
        percent = 10;
    }

    @Test
    public void testCalculateBankCashPositiveOneMonth() {
        double expected = 11;
        double actual = calculateBankCash(money, percent, mount);
        double delta = 0.001;

        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateBankCashPositiveTreeMonth() {
        mount = 3;
        double expected = 13.31;
        double actual = calculateBankCash(money, percent, mount);
        double delta = 0.001;

        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateBankCashNegativeLowPercent() {
        percent = 4;
        calculateBankCash(money, percent, mount);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateBankCashNegativeHighPercent() {
        percent = 26;
        calculateBankCash(money, percent, mount);
    }

}
