package org.example.task3Builder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write name:");
        String name = sc.nextLine();

        System.out.println("Write surname:");
        String surname = sc.nextLine();

        PersonWithLombok person = new PersonWithLombok.PersonWithLombokBuilder()
                .name(name)
                .surname(surname)
                .address(new Address("Russia", "Tula", "Lenina", 144))
                .birthInfo(new BirthInfo(LocalDate.of(1993, 7, 16),
                        LocalTime.of(23, 5, 12, 6666),
                        "Alaska", 6.6, 35.1))
                .build();

        System.out.println(person);


    }
}
