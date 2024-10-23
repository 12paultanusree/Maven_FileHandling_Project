package com.tripillar.filehandling.text;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "This is a sample text for file handling in Java.";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Text file has been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

