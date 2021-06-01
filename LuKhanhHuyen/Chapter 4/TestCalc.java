package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalc {
    Calc calc = new Calc();
    private int a = 8;
    private int b = 2;

    @Test
    public void testAdd() {
        assertEquals(calc.add(a, b), 10);
    }

    @Test
    public void testMinus() {
        assertEquals(calc.minus(a, b), 6);
    }

    @Test
    public void testMultiply() {
        assertEquals(calc.multiply(a, b), 16);
    }

    @Test
    public void testDivide() {
        assertEquals(calc.divide(a, b), 4, 0);
    }
}
