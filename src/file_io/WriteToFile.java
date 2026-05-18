package file_io;
/*Ways to Write to Files
        There are several classes you can use to write files in Java:

        FileWriter - easiest choice for basic text.
        BufferedWriter - better for large text files, because it is faster and supports handy features.
        FileOutputStream - best for binary data (images, audio, PDFs)*/

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/resources/filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// FileWriter will be closed automatically here - tryWithResources
//    try (FileWriter myWriter = new FileWriter("filename.txt"))