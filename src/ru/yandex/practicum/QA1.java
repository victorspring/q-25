package ru.yandex.practicum;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class QA1 {

    public static void main(String[] args) {
        int num;

        num = 3000;
        double d = 10.5;
        float f = 1.1f;
        char c = 'q';

        d = f;


        long l = 9000_000_000L;
        int i2 = (int)l;
        //System.out.println(i2);
        // Гуглите обратный дополненный код
        String s = new String("Hello");
        Scanner scanner = new Scanner(System.in);

        int n = 9;
        increment(n);
        System.out.println(n);

        ru.yandex.practicum.Num number = new Num();
        number.n = 9;
        increment(number);
        System.out.println(number.n);

        int[] array = {9};
        increment(array);
        System.out.println(array[0]);

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Person ivan = new Person("Ivan", 20);

//        System.out.println(ivan.name);
//        System.out.println(ivan.age);
        ivan.sayHi();

        int[] a = {1,2,3};
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        a[0] = 9;
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int[] days = {0, 0, 5, 0, 0, 1, 2, 0, 5, 7, 5, 0, 7, 5, 0, 1, 0};
        System.out.println("Best series: " + bestSeries(days, 5));
        

    }

    static void increment(int number){
        number = number + 1;
    }

    static void increment(Num num){
        num.n = num.n + 1;
    }

    static void increment(int[] array){
        array[0] = array[0] + 1;
    }

    static int bestSeries(int[] days, int goalByStepsPerDay){
        int max = 0;
        int count = 0;
        for (int i = 0; i < days.length; i++){

            if (days[i] >= goalByStepsPerDay){
                count++;
                if (count > max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;

    }
}
