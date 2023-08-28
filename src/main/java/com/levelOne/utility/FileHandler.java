package com.levelOne.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// The 'FileHandler' class is a utility class for reading from and writing to a text file.
// The 'readFile()' method reads the contents of a text file with the given file name and return them as a single 'String'.
// The 'readFile()' method uses 'StringBuilder' to efficiently built the content.
// The 'writeFile()' method writes the provided content to a text file with the given file name. 
// The 'writeFile()' method uses a 'BufferedWriter' for efficient writing.
// Both methods use try-with-resources to automatically close the file resources after their use, ensuring proper resource management.

public class FileHandler {
    // Method to read the contents of a text file and return them as String
    public static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    // Method to write content to a text file
    public static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    // Method to append content to a text file
    public static void appendToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine(); // Add a new line after the appended content
        }
    }
    
}
