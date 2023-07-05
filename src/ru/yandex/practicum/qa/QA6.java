package ru.yandex.practicum.qa;

import ru.yandex.practicum.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

public class QA6 {

    public static void main(String[] args) {
        String s = "ыq";
        System.out.println(Arrays.toString(s.getBytes()));
//        main(args); sof error
        try {
            throwException();
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("RuntimeException");
            e.printStackTrace();
        } catch (Error e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void throwException() throws IOException {
//        Files.readAllLines(Paths.get("."));
//        if (new Random().nextBoolean()) {
//            throw new Exception();
//        }
//        throw new RuntimeException();

        Files.readAllBytes(Paths.get(""));
    }
}
