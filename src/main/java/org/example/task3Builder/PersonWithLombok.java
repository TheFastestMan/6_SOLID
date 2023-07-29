package org.example.task3Builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonWithLombok {
    private String name;
    private String surname;
    private BirthInfo birthInfo;
    private Address address;

}
