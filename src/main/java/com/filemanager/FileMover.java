package com.filemanager;

import java.io.File;
import java.io.IOException;

public class FileMover {
    public static boolean moveFile(String sourcePath, String destinationPath) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("mv", sourcePath, destinationPath);

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return true;
            } else {
                System.out.println("Failed to move file. Exit code: " + exitCode);
            }
        } catch (InterruptedException | IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        return false;
    }
}
