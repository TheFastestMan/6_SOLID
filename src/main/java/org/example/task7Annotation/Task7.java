package org.example.task7Annotation;

import java.lang.reflect.Method;

public class Task7 {
    public static void main(String[] args) {
        Class<?> clazz = Academy.class;
        for (Method method : clazz.getDeclaredMethods()) {

            System.out.println("Method: " + method.getName());
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
                System.out.println("Year " + academyInfo.year());
            } else {
                System.out.println("No any years");
            }
        }


    }
}
