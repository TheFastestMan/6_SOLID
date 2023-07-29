package org.example.task7Annotation;

public class Academy {
    @AcademyInfo(year = 2023)
    public void methodWithAnnotation1() {
        System.out.println("2023");
    }

    @AcademyInfo(year = 2024)
    public void methodWithAnnotation2() {
        System.out.println("2024");
    }

    public void methodWithoutAnnotation() {
        System.out.println("No annotation");
    }

}
