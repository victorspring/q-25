package ru.yandex.practicum.qa;

import ru.yandex.practicum.Num;

import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;

public class QA2 {

    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }*/

        int i = 1;
        Integer integer = 111;
        final double num = Math.random();

        Num n1 = new Num();
        Num n2 = new Num();

        System.out.println("Hello " + "world");
        String s = "Hello";
        s += " World";
        System.out.println(s);

        BigInteger bi1 = new BigInteger("23598292359823597823958239527935982352356");
        BigInteger result = bi1.add(BigInteger.valueOf(4L));
        System.out.println(result);
        int[] a = null;
        String str = null;
        Num n = null;

    }
}
