package com.filemanager;

import java.io.File;

public class FileDeleter {
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return file.delete();
    }
}
