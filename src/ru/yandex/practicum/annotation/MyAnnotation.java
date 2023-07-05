package ru.yandex.practicum.annotation;

import java.lang.annotation.*;
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation {
    int count() default 5;

}