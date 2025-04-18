package youtube_lec_wise.lecture8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    static Properties properties;
    static
    {
        try
        {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\dahiy\\IdeaProjects\\Youtube_Java_Session\\src\\main\\resources\\config.properties");
            properties = new Properties();
            properties.load(inputStream);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }

}
