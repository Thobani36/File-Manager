package com.filemanager;

import java.io.File;

public class FileMover {
    public static boolean moveFile(String sourcePath, String destinationPath) {
        File source = new File(sourcePath);
        File dest = new File(destinationPath);
        return source.renameTo(dest);
    }
}
