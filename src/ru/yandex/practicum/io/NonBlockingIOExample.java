package ru.yandex.practicum.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NonBlockingIOExample {
    public static void main(String[] args) {
        try {
            // Open input and output file channels
            FileChannel inputFileChannel = FileChannel.open(Paths.get("input.txt"), StandardOpenOption.READ);
            FileChannel outputFileChannel = FileChannel.open(Paths.get("output.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

            // Create a buffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read from input and write to output
            while (inputFileChannel.read(buffer) != -1 || buffer.position() > 0) {
                buffer.flip();  // Switch buffer to read mode
                outputFileChannel.write(buffer);
                buffer.compact();  // Clear buffer for the next read
            }

            // Close the channels
            inputFileChannel.close();
            outputFileChannel.close();

            System.out.println("Data copied successfully using non-blocking I/O.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
