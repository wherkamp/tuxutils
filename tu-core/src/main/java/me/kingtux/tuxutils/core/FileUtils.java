package me.kingtux.tuxutils.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
    /**
     * Takes file and turns it into a string
     *
     * @param file the file to read
     * @return the string
     */
    public static String fileToString(String file) {
        return fileToString(new File(file));
    }

    /**
     * Takes file and turns it into a string
     *
     * @param file the file to read
     * @return the string
     */
    public static String fileToString(File file) {
        if (!file.exists()) {
            return "";
        }
        try {
            return CommonUtils.bufferedReaderToString(new BufferedReader(new FileReader(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
