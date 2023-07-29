package org.example;

import java.lang.reflect.Method;

public class Test {
    public void analizer(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(XmlAttribute.class)) {
                XmlAttribute xmlAttribute = method.getAnnotation(XmlAttribute.class);
                System.out.println(xmlAttribute.name());
            }
            if (method.isAnnotationPresent(XmlElement.class)) {
                XmlElement xmlElement = method.getAnnotation(XmlElement.class);
                System.out.println(xmlElement.name());
            }
        }
    }
}
