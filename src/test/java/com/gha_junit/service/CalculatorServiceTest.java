package com.gha_junit.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testAddition() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testRest(){
        int result =  calculatorService.rest(3, 2);
        assertEquals(1, result);
    }
}