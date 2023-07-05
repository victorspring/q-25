package ru.yandex.practicum.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyClass myObject = new MyClass();

        Method method = MyClass.class.getMethod("hello");
        MyAnnotation an = method.getAnnotation(MyAnnotation.class);
        for (int i = 0; i < an.count(); i++) {
            method.invoke(myObject);
        }

    }
}
