package me.kingtux.tuxutils.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

public class CommonUtils {
    /**
     * Takes a bufferedReader and turns it into a string
     *
     * @param bufferedReader the reader to read
     * @return the string
     */
    public static String bufferedReaderToString(BufferedReader bufferedReader) throws IOException {
        StringBuilder fullContent = new StringBuilder();
        String singleLine = "";
        while ((singleLine = bufferedReader.readLine()) != null) {
            fullContent = fullContent.append(singleLine).append("\n");
        }
        return fullContent.toString();

    }

    public static String insertDashesIntoUUID(String uuid) {
        return new StringBuilder(uuid).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
    }

    public static UUID insertDashesIntoUUID(UUID uuid) {
        return UUID.fromString(insertDashesIntoUUID(uuid.toString()));
    }

    public static String encodeString(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }
}
