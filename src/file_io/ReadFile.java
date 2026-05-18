package file_io;

/*Other Ways to Read Files
        There are several classes you can use to read files in Java:

        Scanner - best for simple text and when you want to parse numbers or words easily.
        BufferedReader - best for large text files, because it is faster and reads line by line.
        FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.*/

import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("src/resources/filename.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

/*
import java.io.File;  // Import the File class

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("src/resources/filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}*/
