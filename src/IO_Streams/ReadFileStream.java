package IO_Streams;
/*
Choosing the Right Class
        Java gives you several ways to write to files. Here's when to pick each one:

        FileWriter - best for basic text files. Simple and easy to use.
        BufferedWriter - best for large text files, because it is faster and lets you add new lines easily.
        FileOutputStream - best for binary data (images, PDFs, audio) or when you need full control of raw bytes.
*/

import java.io.FileInputStream;  // Import FileInputStream
import java.io.IOException;      // Import IOException

public class ReadFileStream {
    public static void main(String[] args) {
        // try-with-resources: FileInputStream will be closed automatically
        try (FileInputStream input = new FileInputStream("src/resources/filename.txt")) {

            int i;  // variable to store each byte that is read

            // Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.print((char) i);
            }

        } catch (IOException e) {
            // If an error happens (e.g. file not found), print an error message
            System.out.println("Error reading file.");
        }
    }
}
