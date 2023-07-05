package ru.yandex.practicum;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TextEncodings {

    public static void main(String[] args) {

        try (Writer out = new OutputStreamWriter(System.out)) {
            out.write(decodeText(
                    "Съешь ещё этих мягких французских булок да выпей же чаю"));

        } catch (IOException e) {
            // игнорируем
        }
    }

    static String decodeText(String input) throws IOException {
        return new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(input.getBytes()))).readLine();
//                new ByteArrayInputStream(input.getBytes(UTF_8)), UTF_8)).readLine();
    }
}