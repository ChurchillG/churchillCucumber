package utils;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigReader {

    static Properties properties;

    public static Properties getProperties() {

        try {

            FileInputStream file =
                    new FileInputStream(
                            "src/test/resources/config.properties"
                    );

            properties = new Properties();

            properties.load(file);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return properties;
    }
}
