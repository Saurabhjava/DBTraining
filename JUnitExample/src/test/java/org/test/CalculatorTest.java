package org.test;

import org.example.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator cal;
    @BeforeEach
    void setup(){
       cal=new Calculator();
    }
    @AfterEach
    void destroy(){
       cal=null;
    }
    @Test
    void testCalculate(){
        assertEquals(30, cal.calculate(10,20));
    }
    @Test
    void testPrime(){
        assertTrue(cal.isPrine(11));
        assertFalse(cal.isPrine(15));
    }
}
