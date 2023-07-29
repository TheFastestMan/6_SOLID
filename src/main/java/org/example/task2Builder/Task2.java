package org.example.task2Builder;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write name: ");
        String name = scanner.nextLine();

        System.out.println("Write surname: ");
        String surname = scanner.nextLine();

        System.out.println("Write year of birth: ");
        int yearOfBirth = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Write address: ");
        String address = scanner.nextLine();

        Person person = new Person.PersonBuilder()
                .setName(name)
                .setSurname(surname)
                .setYearOfBirth(yearOfBirth)
                .setAddress(address)
                .build();

        System.out.println(person);
    }

}
