package org.greenshirtgames;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculationTest {

    @Test
    public void add() {
        assertEquals(new Double(4.0), new Double(Calculation.add(2.0,2.0)));
    }

    @Test
    public void sub() {
        assertEquals(new Double(0.0), new Double(Calculation.sub(2.0,2.0)));
    }

    @Test
    public void divide() {
        assertEquals(new Double(4.0), new Double(Calculation.divide(12.0,3.0)));
    }

    @Test
    public void mul() {
        assertEquals(new Double(4.0), new Double(Calculation.mul(2.0,2.0)));
    }

    @Test
    public void factorial() {
        assertEquals(new Integer(2), new Integer(Calculation.factorial(2)));
        assertEquals(new Integer(6), new Integer(Calculation.factorial(3)));
        assertEquals(new Integer(24), new Integer(Calculation.factorial(4)));
        assertEquals(new Integer(120), new Integer(Calculation.factorial(5)));
    }
}