package com.example.taxcalculator;

import com.example.taxcalculator.service.ProcessTax;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.MockitoAnnotations;

class ProcessTaxTest {
    @InjectMocks
    ProcessTax processTax;
    private AutoCloseable closeable;
    @BeforeEach
    void init()
    {
        closeable = MockitoAnnotations.openMocks(this);
    }
    @AfterEach
     void closeService() throws Exception
    {
        closeable.close();
    }

    @Test
    void testTaxCalculation()
    {
        int income = 10;
        int months = 5;
        double totalTax = processTax.calculate(income,months);
        assertEquals(15.0,totalTax);
    }
}
