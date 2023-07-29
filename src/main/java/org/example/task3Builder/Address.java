package org.example.task3Builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Address {
    private String Country;

    private String city;

    private String street;

    private Integer houseNumber;
}
