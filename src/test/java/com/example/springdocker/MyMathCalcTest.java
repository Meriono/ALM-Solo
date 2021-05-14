package com.example.springdocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hanna Edlund
 * Date: 2021-05-14
 * Time: 09:13
 * Project: spring-docker-demo
 */
public class MyMathCalcTest {
    MyMathCalc math = new MyMathCalc();

    @Test
    public void testAddMethod(){
        int expected = 5;
        int actual = math.add(2,3);

        assertEquals(expected,actual);
    }

    @Test
    public void testMultipyMethod(){
        int expected = 6;
        int actual = math.multiply(2,3);

        assertEquals(expected,actual);
    }

    @Test
    public void testDivideMethod(){
        int expected = 5;
        double actual = math.divide(10,2);

        assertEquals(expected,actual);
    }

    @Test
    public void testDivideThrowsZero(){
        assertThrows(ArithmeticException.class,() -> math.divide(2,0));
    }
}
