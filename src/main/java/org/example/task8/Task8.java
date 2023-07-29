package org.example.task8;


public class Task8 {
    public static void main(String[] args) {
        AnnotationTest annotationTest = new AnnotationTest();
        CallOld callOld = new CallOld();

        System.out.println(callOld.call(annotationTest));
    }
}
