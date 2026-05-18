package IO_Streams;

import java.io.FileOutputStream;
import java.io.IOException;
/*FileOutputStream class works in a similar way, but it writes data as raw bytes.
That means you can use it not only for text files, but also for binary files (like images, PDFs, or audio).*/

public class WriteFileStream {
    public static void main(String[] args) {
        // The text we want to write
        String text = "Hello World!";

        // try-with-resources: stream will be closed automatically
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write(text.getBytes());  // convert text to bytes and write
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
