package org.example.task4REFLECTION;

public class Man {
    private String name;
    private String surname;
    private int age;
    private String profession;

    public Man(String name, String surname, int age, String profession) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
    }

    public void healthCheckAdvisor(int age) {
        if (age < 30) {
            System.out.println("Check your health from time to time");
        } else if (age >= 30) {
            System.out.println("Check your health at least once every 2 years");
        } else if (age >= 50) {
            System.out.println("Check your health at least once a year");
        }
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void sayAge() {
        System.out.println("Hello, I am " + age + " years old!");
    }

}