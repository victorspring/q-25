package ru.yandex.practicum.qa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Project2 {

    //    C:\Users\Victor\IdeaProjects\qa-25\src\ru\yandex\practicum\qa\QA2.java
    // /usr/Victor/home
    private static final String QA2_ABSOLUTE_PATH =
            "C:\\Users\\Victor\\IdeaProjects\\qa-25\\src\\ru\\yandex\\practicum\\qa\\QA2.java";

    //    src\ru\yandex\practicum\qa-25\QA2.java
    private static final String QA2_RELATIVE_PATH =
            "src\\ru\\yandex\\practicum\\qa\\QA2.java";

    private static final String TEXT_1_RELATIVE_PATH =
            "resources" + File.separator + "text1.txt";

    public static void main(String[] args) throws IOException {
        String content = readFileToString(TEXT_1_RELATIVE_PATH);
//        System.out.println(content);

        List<String> lines = readFileToList(TEXT_1_RELATIVE_PATH);
        for (String line : lines) {
//            System.out.println(line);
        }

        for (int i = 1; i <= 3; i++) {
            List<String> fileLines = readFileToList(String.format(
                    "resources%stext%d.txt", File.separator, i));
            System.out.println(fileLines);
        }

    }

    private static String readFileToString(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

    private static List<String> readFileToList(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return Collections.emptyList();
        }
    }

}
