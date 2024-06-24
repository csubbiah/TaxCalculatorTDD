package com.example.taxcalculator.service;


import org.springframework.stereotype.Component;

@Component
public class ProcessTax {
    private static final double TAX_PERCENTAGE = 0.3;
    public double calculate(int income, int months)
    {
        return income * months* TAX_PERCENTAGE;
    }
}
