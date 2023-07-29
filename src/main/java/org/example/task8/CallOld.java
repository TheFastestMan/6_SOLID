package org.example.task8;


public class CallOld {
    @SuppressWarnings("deprecation")
    public String call(AnnotationTest test) {
        return test.old();
    }
}
