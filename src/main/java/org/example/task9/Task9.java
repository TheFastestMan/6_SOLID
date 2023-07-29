package org.example.task9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task9 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        catLife();
    }

    public static Cat catCreator() throws InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchMethodException {

        Class<?> classCat = Cat.class;
        Constructor<?> constructor = classCat.getConstructor();

        return (Cat) constructor.newInstance();
    }

    public static void catLife() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Cat cat = catCreator();

        Method eatMethod = cat.getClass().getDeclaredMethod("eat");
        Method sleepMethod = cat.getClass().getDeclaredMethod("sleep", int.class);

        eatMethod.invoke(cat);
        sleepMethod.invoke(cat, 4);
    }

}
