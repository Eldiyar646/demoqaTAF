package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.demoqa.drivers.Driver_Manager.getDriver;

public class Links_Page extends BasePage {

    @FindBy(id = "simpleLink")
    public WebElement simpleLink;

    @FindBy(id = "dynamicLink")
    public WebElement dynamicLink;

    @FindBy(id = "created")
    public WebElement created;

    @FindBy(id = "no-content")
    public WebElement noContent;

    @FindBy(id = "moved")
    public WebElement moved;

    @FindBy(id = "bad-request")
    public WebElement badRequest;

    @FindBy(id = "unauthorized")
    public WebElement unauthorized;

    @FindBy(id = "forbidden")
    public WebElement forbidden;

    @FindBy(id = "invalid-url")
    public WebElement invalidUrl;

    @FindBy(id = "linkResponse")
    public WebElement linkResponseMessage;


    public void newSimpleLinkAndNewTab() {
        int windows = driver.getWindowHandles().size();
        actions.click(simpleLink);
        wait.until(driver -> driver.getWindowHandles().size() > windows);
    }

    public void newDynamicLink() {
        actions.click(dynamicLink);
    }

    public void createdLink() {
        actions.click(created);
    }

    public void noContentLink() {
        actions.click(noContent);
    }

    public void movedLink() {
        actions.click(moved);
    }

    public void badRequestLink() {
        actions.click(badRequest);
    }

    public void unauthorizedLink() {
        actions.click(unauthorized);
    }

    public void forbiddenLink() {
        actions.click(forbidden);
    }

    public void notFoundLink() {
        actions.click(invalidUrl);
    }

    public String getTextAfterClick(String previousText) {
        wait.until(driver -> !linkResponseMessage.getText().equals(previousText));
        return linkResponseMessage.getText();
    }
}
