package com.filemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static String readFile(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }

        br.close();
        return content.toString();
    }
}
