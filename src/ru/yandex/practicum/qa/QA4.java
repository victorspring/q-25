package ru.yandex.practicum.qa;

import ru.yandex.practicum.IntegerListGenerator;
import ru.yandex.practicum.ListGenerator;
import ru.yandex.practicum.Num;
import ru.yandex.practicum.StringListGenerator;

import java.time.LocalDateTime;
import java.util.*;

public class QA4 {

    public static void main(String[] args) {
        final int age = new Random().nextBoolean() ? 20 : 10;
        System.out.printf("My name is %s %nI'm " + age  + " years old%n", new Random().nextBoolean() ? "Alex" : "John", age);

        String s = String.format("%.10f", 10.50923456789);
        System.out.println(s); //Formatter


        List<Num> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Num num = new Num();
            num.n = i+1;
            list.add(num);
        }

        System.out.println(Math.abs(-10));

        int[] array = {5, -1, 10, 2, -9, 1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(age);

        int i = (byte)128;
        System.out.println(i);

        System.out.println(new Object());
        System.out.println("Hello");
        System.out.println(LocalDateTime.now());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);

        System.out.println(numbers.get(1));

        System.out.println(getType(LocalDateTime.now()));

        List<ListGenerator<?>> generators = new ArrayList<>();
        generators.add(new IntegerListGenerator());
        generators.add(new StringListGenerator());

        List<? extends Number> numList = new ArrayList<Integer>();
        numList = new ArrayList<Double>();
        numList = new ArrayList<Long>();

        List<? super Integer> intList = new ArrayList<Integer>();
        intList = new ArrayList<Number>();
        intList = new ArrayList<Object>();



    }

    public static <T> String getType(T type){
        return type.getClass().getCanonicalName();
    }
}
