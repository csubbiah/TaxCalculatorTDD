package com.example.taxcalculator.controller;

import com.example.taxcalculator.dto.Tax;
import com.example.taxcalculator.service.ProcessTax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {


    ProcessTax processTax;
    @Autowired
    TaxController(ProcessTax processTax1) { this.processTax = processTax1; }
    @GetMapping("/getTax")
    public ResponseEntity<Tax> calculateTax(@RequestParam int income , @RequestParam int months){
        return ResponseEntity.ok().body(Tax.builder().income(income).months(months).taxToBePaid(processTax.calculate(income, months)).build());
    }
}