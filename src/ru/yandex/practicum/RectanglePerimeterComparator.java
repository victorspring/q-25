package ru.yandex.practicum;

import java.util.Comparator;

public class RectanglePerimeterComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return o1.perimeter() - o2.perimeter();
    }
}
