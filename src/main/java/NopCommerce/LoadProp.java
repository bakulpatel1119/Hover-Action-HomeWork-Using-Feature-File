package NopCommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


// Load prop class created to access data from testconfig.properties file

public class LoadProp {
    static Properties prop;
    static FileInputStream input;
    static String fileName = "testconfig.properties";
    static String fileLocation = "src\\test\\Resources\\testconfig.properties";

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}