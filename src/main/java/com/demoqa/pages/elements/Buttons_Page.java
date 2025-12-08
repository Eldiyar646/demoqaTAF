package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons_Page extends BasePage {

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClick;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClick;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMe;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;


    public Buttons_Page doDoubleClick() {
        actions.double_Click(doubleClick);
        return this;
    }

    public Buttons_Page doRightClick() {
        actions.right_Click(rightClick);
        return this;
    }

    public Buttons_Page doDynemicClick() {
        actions.click(clickMe);
        return this;
    }

    public String getTextAfterClick(WebElement message) {
        return message.getText();
    }


}
