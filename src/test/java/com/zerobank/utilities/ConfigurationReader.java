package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configfile;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            configfile = new Properties();

            configfile.load(fileInputStream);

            fileInputStream.close();
        } catch (IOException e) {

            System.out.println("File was not loaded ");

            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {

        return configfile.getProperty(key);
    }
}
