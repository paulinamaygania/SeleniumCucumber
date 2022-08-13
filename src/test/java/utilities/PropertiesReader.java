package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;

public class PropertiesReader {

    private static final String CONFIGFILEPATH = "./config.properties";

    public static String getValue(String key) throws Exception {

        File file = new File(CONFIGFILEPATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

}
