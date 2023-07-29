package org.example.task3Builder;

import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
public class BirthInfo {
    private final LocalDate birthday;

    private final LocalTime birthtime;

    private final String birthplace;

    private final Double weight;

    private final Double height;
}
