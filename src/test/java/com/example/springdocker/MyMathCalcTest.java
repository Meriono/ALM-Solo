package com.example.springdocker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hanna Edlund
 * Date: 2021-05-14
 * Time: 09:13
 * Project: spring-docker-demo
 */
public class MyMathCalcTest {

    @DisplayName("Test add method that will succed")
    @Test
    public void testAddMethod(){
        MyMathCalc math = new MyMathCalc();
        int expected = 5;
        int actual = math.add(2,3);

        assertEquals(expected,actual);
    }

    @Test
    public void testMultipyMethod(){
        MyMathCalc math = new MyMathCalc();
        int expected = 6;
        int actual = math.multiply(2,3);

        assertEquals(expected,actual);
    }

    @Test
    public void testDivideMethod(){
        MyMathCalc math = new MyMathCalc();
        int expected = 5;
        double actual = math.divide(10,2);

        assertEquals(expected,actual);
    }

    @Test
    public void testDivideThrowsZero(){
        MyMathCalc math = new MyMathCalc();
        assertThrows(ArithmeticException.class,() -> math.divide(2,0));
    }
}
