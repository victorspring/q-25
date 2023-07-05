package ru.yandex.practicum.qa;

import ru.yandex.practicum.Rectangle;
import ru.yandex.practicum.RectanglePerimeterComparator;

import java.time.LocalDate;
import java.util.*;

public class QA5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner = null;

        LocalDate lc = LocalDate.now();

        int a = 5;

        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        System.out.println(list);

        Rectangle r1 = new Rectangle(2,5);
        Rectangle r2 = new Rectangle(7,20);
        Rectangle r3 = new Rectangle(10,3);

        List<Rectangle> rectangles = new ArrayList<>(List.of(r1,r2,r3));
        System.out.println(rectangles);
        Collections.sort(rectangles, new RectanglePerimeterComparator());
        System.out.println(rectangles);

        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);

        System.out.println(map);
        int i = 5;
        System.out.println(++i + ++i);
    }
}
