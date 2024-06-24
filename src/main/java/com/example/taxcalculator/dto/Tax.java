package com.example.taxcalculator.dto;

import lombok.*;

//@Data
@Builder
public record Tax(int income, int months, double taxToBePaid) {
}
