package com.demoqa.pages;

import com.demoqa.actions.Web_Element_Actions;
import com.demoqa.drivers.Driver_Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Web_Element_Actions actions;

    public BasePage() {
        this.driver = Driver_Manager.getDriver();
        this.wait = Driver_Manager.getWait();
        this.actions = new Web_Element_Actions(driver, wait);

        PageFactory.initElements(driver, this);
    }
}
