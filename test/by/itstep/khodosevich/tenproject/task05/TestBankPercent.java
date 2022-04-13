package by.itstep.khodosevich.tenproject.task05;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task05.module.BankPercent.*;


public class TestBankPercent {

    public static final double money;
    public static final double mount;
    public static double percent;

    static {
        money = 1000;
        mount = 10;
        percent = 10;
    }

    @Test
    public void testCalculateBankCashPositive(){
        double expected = money*mount*percent/100;
        double actual  = calculateBankCash(money, percent, mount);
        double delta = 0.001;

        assertEquals(expected, actual, delta);
    }

    @Test (expected = RuntimeException.class)
    public void testCalculateBankCashNegativeLowPercent(){
        percent = 4;
        calculateBankCash(money, percent, mount);
    }

    @Test (expected = RuntimeException.class)
    public void testCalculateBankCashNegativeHighPercent(){
        percent = 26;
        calculateBankCash(money, percent, mount);
    }

}
