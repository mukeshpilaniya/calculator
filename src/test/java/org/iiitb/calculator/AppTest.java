package org.iiitb.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private App calc;
    @Before
    public void setUp() {
        calc = new App();
    }

    @Test
    public void testAdd() {
        int a = 12;
        int b = 21;
        int expectedResult = 33;
        long result = calc.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testSub() {
        int a = 21;
        int b = 11;
        int expectedResult = 10;
        long result = calc.diff(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
}
