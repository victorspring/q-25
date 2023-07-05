package ru.yandex.practicum;

import java.util.List;

public class IntegerListGenerator implements ListGenerator<Integer>{
    @Override
    public List<Integer> generate() {
        return List.of(1,2,3);
    }
}
