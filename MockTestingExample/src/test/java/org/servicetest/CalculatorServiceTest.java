package org.servicetest;

import org.example.CalculatorService;
import org.example.ICalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {
    CalculatorService cService;
    @BeforeEach
    void setup(){
        ICalculator cal= Mockito.mock(ICalculator.class);
        cService=new CalculatorService(cal);
        int a=10;
        int b=5;
        int result=15;
        when(cal.calculate(a,b)).thenReturn(result);
    }
    @Test
    void addServiceTest() {
        assertEquals(15,cService.addService(10,5));
    }
}
