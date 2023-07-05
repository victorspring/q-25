package ru.yandex.practicum;

import java.util.List;

public class StringListGenerator implements ListGenerator<String> {
    @Override
    public List<String> generate() {
        return List.of("Helo", "World");
    }
}
