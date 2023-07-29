package org.example.task4REFLECTION;

import java.lang.reflect.Field;

public class Task4 {
    public static void main(String[] args) throws IllegalAccessException {
        Man man = new Man("Rail", "Ravilov", 30, "Programmer");

        getClassInfoByReflection(man);
    }

    public static void getClassInfoByReflection(Object object) throws IllegalAccessException {
        Class<?> objectClass = object.getClass();

        System.out.println("Class name is: " + objectClass.getName());

        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType().getName());
            System.out.println("Value: " + field.get(object));
        }
    }

}
