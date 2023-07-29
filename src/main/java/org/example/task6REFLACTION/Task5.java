package org.example.task6REFLACTION;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Class<?> mapClass = HashMap.class;
        Class<?> linkedListClass = LinkedList.class;

        System.out.println("HashMap:");
        System.out.println("Parent class : " + mapClass.getSuperclass().getName());
        System.out.println("Class : " + mapClass.getName());

        System.out.println("----------------------");

        for (Field field : mapClass.getDeclaredFields()) {
            System.out.println("Field : " + field);
        }

        System.out.println("----------------------");

        for (Method method : mapClass.getDeclaredMethods()) {
            System.out.println("Method : " + method);
        }

        System.out.println("----------------------");

        for (Constructor<?> constructor : mapClass.getDeclaredConstructors()) {
            System.out.println("Constructor: " + constructor);
        }

        System.out.println("----------------------");

        for (Class<?> innerClass : mapClass.getDeclaredClasses()) {
            System.out.println("InnerClass: " + innerClass.getName());
        }
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        System.out.println("LinkedList class: ");
        System.out.println("Parent class : " + linkedListClass.getSuperclass().getName());
        System.out.println("Class : " + linkedListClass.getName());

        System.out.println("----------------------");

        for (Field field : linkedListClass.getDeclaredFields()) {
            System.out.println("Field : " + field);
        }

        System.out.println("----------------------");

        for (Method method : linkedListClass.getDeclaredMethods()) {
            System.out.println("Method : " + method);
        }

        System.out.println("----------------------");

        for (Constructor<?> constructor : linkedListClass.getDeclaredConstructors()) {
            System.out.println("Constructor: " + constructor);
        }

        System.out.println("----------------------");

        for (Class<?> innerClass : linkedListClass.getDeclaredClasses()) {
            System.out.println("InnerClass: " + innerClass.getName());
        }
    }
}
