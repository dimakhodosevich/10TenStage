package by.itstep.khodosevich.tenproject.task01;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.tenproject.task01.module.logic.SameValue.*;

public class TestSameValue {

    public static final int oneNumber;
    public static final double[] sameValues;
    public static final double[] variousValues;
    public static String goodMessage;

    static {
        goodMessage = "Your method works bad!!!";
        variousValues = new double[]{2, 35, 2, 6, 31, 4};
        sameValues = new double[]{7,7,7,7,7,7,7};
        oneNumber = 1;
    }

    @Test()
    public void testCheckTheSameValuePositive(){
        boolean actual = checkTheSameValue(sameValues);
        assertTrue(goodMessage,actual);
    }

    @Test()
    public void testCheckTheSameValueNegative(){
        boolean actual = checkTheSameValue(variousValues);
        assertTrue(goodMessage,actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckTheSameValueWithZeroLength(){
        boolean actual = checkTheSameValue(new double[0]);
        assertTrue(goodMessage,actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckTheSameValueWithOneNumberInValue(){
        boolean actual = checkTheSameValue(oneNumber);
        assertTrue(goodMessage,actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckTheSameValueWithNull(){
        boolean actual = checkTheSameValue(null);
        assertTrue(goodMessage,actual);
    }

}
