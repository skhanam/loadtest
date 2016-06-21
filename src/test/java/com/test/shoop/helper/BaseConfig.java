package com.test.shoop.helper;

import com.test.shoop.utility.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by thadeus on 06/06/16.
 */
public class BaseConfig extends Driver{
    public static Properties CONFIG = null;
    static String search;

    private static void initializeConfig() throws FileNotFoundException,
            IOException {
        CONFIG = new Properties();

        FileInputStream fn = new FileInputStream("config.properties");
        CONFIG.load(fn);
    }

    public static String getBrowserName() throws IOException {
        search = "Browser";
        String browser = null;
        initializeConfig();

        if (CONFIG.getProperty(search) != null)

            browser = CONFIG.getProperty(search);
        return browser;

    }



}
