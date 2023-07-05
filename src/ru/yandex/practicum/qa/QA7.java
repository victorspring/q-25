package ru.yandex.practicum.qa;

import ru.yandex.practicum.IntegerListGenerator;
import ru.yandex.practicum.Rectangle;
import ru.yandex.practicum.RectanglePerimeterComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QA7 {

    public static void main(String[] args) {

        class InternalRectanglePerimeterComparator implements Comparator<Rectangle> {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return o1.perimeter() - o2.perimeter();
            }
        }

        Rectangle r1 = new Rectangle(20, 20);
        Rectangle r2 = new Rectangle(10, 10);

        List<Rectangle> rectangles = new ArrayList<>(List.of(r1, r2));
        List<Rectangle> rectangles2 = new ArrayList<>(){{add(r1);add(r2);}};

        Collections.sort(rectangles, new RectanglePerimeterComparator());
        System.out.println(rectangles);

        Collections.sort(rectangles, new InternalRectanglePerimeterComparator());
        System.out.println(rectangles);

        Collections.sort(rectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return o1.perimeter() - o2.perimeter();
            }
        });
        System.out.println(rectangles);

        Collections.sort(rectangles, (o1, o2) -> o1.perimeter() - o2.perimeter());
        System.out.println(rectangles);

        List<Integer> ints = new ArrayList<>(List.of(1,2,3,4,5));
        for (int i : ints) {
            if (i % 2 == 0)
                System.out.println(i);
        }

         ints.stream()
                .filter(i -> i % 2 == 0)
                .map(String::valueOf)
                 .collect(Collectors.joining(","));
//        System.out.println(result);

        IntStream.range(1, 10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

    }
}
