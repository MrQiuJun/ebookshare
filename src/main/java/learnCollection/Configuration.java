package learnCollection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private Properties properties;
    private String value;
    public Configuration() throws IOException {
        this("src/main/resources/","db.properties");
    }
    public Configuration(String filePath, String fileName) throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(filePath + fileName));
    }
    public String getProperty(String key){
        value = properties.getProperty(key);
        return value;
    }
}
