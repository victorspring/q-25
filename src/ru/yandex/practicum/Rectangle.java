package ru.yandex.practicum;

public class Rectangle implements Comparable<Rectangle> {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int perimeter(){
        return width + height;
    }

    public int square(){
        return width * height;
    }


    @Override
    public int compareTo(Rectangle o) {
        return this.square() - o.square();
    }
}
