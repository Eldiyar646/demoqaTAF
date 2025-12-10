package com.demoqa.drivers;

import com.demoqa.config.FileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


//Шаблон проектирования Singleton, одиночка т.е. у этого класса
// будет только один экземпляр (объект) на весь проект
public class Driver_Manager {

    private Driver_Manager() {
    }

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (FileReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = Chrome_Web_Driver.load_Chrome_Driver();
                    break;
                case "firefox":
                    driver = Firefox_Web_Driver.load_Firefox_Driver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser parameters");
            }

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return driver;
    }

    public static WebDriverWait getWait(){
        if(wait == null) {
            getDriver();
        }
        return wait;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing browser");
        }
    }



}

