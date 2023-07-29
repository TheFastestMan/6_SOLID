package org.example.task5REFLECTION;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task5 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        PrintHello printHello = new PrintHello();
        Class<?> reflectionHello = printHello.getClass();

        Method method = reflectionHello.getDeclaredMethod("printHelloWorld");

        method.invoke(printHello);
    }
}
