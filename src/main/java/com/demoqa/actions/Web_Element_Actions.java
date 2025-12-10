package com.demoqa.actions;

import com.demoqa.drivers.Driver_Manager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Web_Element_Actions {

    public Web_Element_Actions(WebDriver driver, WebDriverWait wait) {
    }

    public Web_Element_Actions wait_Element_ToBe_Displayed (WebElement element){
        new WebDriverWait(Driver_Manager.getDriver(),
                Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Web_Element_Actions wait_Element_ToBe_Clickable (WebElement element){
        new WebDriverWait(Driver_Manager.getDriver(),
                Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Web_Element_Actions click (WebElement element) {
        wait_Element_ToBe_Displayed(element).wait_Element_ToBe_Clickable(element);
        scroll_To_Element(element);
        element.click();
        return this;
    }

    public Web_Element_Actions double_Click (WebElement element) {
        wait_Element_ToBe_Displayed(element).wait_Element_ToBe_Clickable(element);
        scroll_To_Element(element);

        Actions selenium_actions = new Actions(Driver_Manager.getDriver());
        selenium_actions.doubleClick(element).perform();
        return this;
    }

    public Web_Element_Actions right_Click (WebElement element) {
        wait_Element_ToBe_Displayed(element).wait_Element_ToBe_Clickable(element);
        scroll_To_Element(element);

        Actions action = new Actions(Driver_Manager.getDriver());
        action.contextClick(element).perform();
        return this;
    }

    public Web_Element_Actions type(WebElement element, String text) {
        wait_Element_ToBe_Displayed(element);
        scroll_To_Element(element);
        element.sendKeys(text);
        return this;
    }

    public void scroll_To_Element(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver_Manager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
