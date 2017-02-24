package com.workshop.demo01;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void add_1_and_2_should_be_3() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void add_2_and_2_should_be_4() {
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void minus_2_and_2_should_be_0() {
        int result = calculator.minus(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void mutiply_2_and_2_should_be_4() {
        int result = calculator.multiply(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void divide_2_and_2_should_be_1() {
        int result = calculator.divide(2, 2);
        assertEquals(1, result);
    }

    @Test(expected = MyException.class)
    public void divide_2_and_0_should_be_throw_my_exception() {
        calculator.divide(2, 0);
    }

}
