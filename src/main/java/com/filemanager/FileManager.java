package com.filemanager;

import java.util.Scanner;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the File Manager Tool");

        while (true) {
            System.out.println("Choose an action: 1. Read File 2. Write File 3. Move File 4. Delete File 5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter file path to read:");
                    String readPath = scanner.nextLine();
                    try {
                        String content = MyFileReader.readFile(readPath);
                        System.out.println("File content:");
                        System.out.println(content);
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter file path to write:");
                    String writePath = scanner.nextLine();
                    System.out.println("Enter content to write:");
                    String content = scanner.nextLine();
                    try {
                        MyFileWriter.writeFile(writePath, content);
                        System.out.println("Content written successfully.");
                    } catch (IOException e) {
                        System.out.println("Error writing file: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter source file path:");
                    String source = scanner.nextLine();
                    System.out.println("Enter destination file path:");
                    String destination = scanner.nextLine();
                    if (FileMover.moveFile(source, destination)) {
                        System.out.println("File moved successfully.");
                    } else {
                        System.out.println("Error moving file.");
                    }
                    break;
                case 4:
                    System.out.println("Enter file path to delete:");
                    String deletePath = scanner.nextLine();
                    if (FileDeleter.deleteFile(deletePath)) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Error deleting file.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting File Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
