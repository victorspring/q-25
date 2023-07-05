package ru.yandex.practicum;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;

public class Employee extends Object {
    private String name;
    private int age;
    private LocalDate birthDate;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Period.between(LocalDate.now(), birthDate).getDays();
    }

    public void setAge(int age) {
        if (age < 0){
            throw new RuntimeException("Age must be positive");
        }
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
