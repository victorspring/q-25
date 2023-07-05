package ru.yandex.practicum.io;

import javax.swing.text.html.Option;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

public class BlockingIOExample {
    public static void main(String[] args) {
        try {
            // Open input and output streams
            FileInputStream inputFile = new FileInputStream("input.txt");
            FileOutputStream outputFile = new FileOutputStream("output.txt");

            // Read from input and write to output
            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }

            // Close the streams
            inputFile.close();
            outputFile.close();

            System.out.println("Data copied successfully using blocking I/O.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}