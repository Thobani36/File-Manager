package com.filemanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public static void writeFile(String filePath, String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(filePath, true)); // 'true' to append
        bw.write(content);
        bw.newLine();
        bw.close();
    }
}
