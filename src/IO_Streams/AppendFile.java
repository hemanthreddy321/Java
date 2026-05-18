package IO_Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        String text = "\nAppended text!";

        // true = append mode (keeps existing content)
        try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
            output.write(text.getBytes());
            System.out.println("Successfully appended to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}

/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // true = append mode
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
            bw.newLine();                      // move to a new line
            bw.write("Appended line");         // add new text at the end
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}*/
