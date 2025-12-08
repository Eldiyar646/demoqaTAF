package com.demoqa.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    // Создали статический блок, внутри него через try и catch
    // получили доступ к нашему файлу, указали путь к нему, с помощью
    // inputStream можем прочитать содержимое этого файла и загрузить его с помощью метода load
    private static Properties properties;
    static {
        try{
            String path = "src/main/resources/app.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //этот метод позволяет получать данные с файла app.properties
    //файлы хранятся в виде, ключ - значение (browser - ключ, chrome - значение)
    public static String getValue(String key){
        return properties.getProperty(key).trim();
    }

    public static void main(String[] args) {
        System.out.println(getValue("browser"));
    }

}
