package com.demoqa.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Web_Driver {

    //Этот метод позволяет запустить настройки или параметры в браузере
    public static WebDriver load_Chrome_Driver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920, 1080");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;

    }
}
