package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Text_Box_Page extends BasePage {

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement button;


    @FindBy(css = "p#name")
    public WebElement resultName;

    @FindBy(css = "p#email")
    public WebElement resultEmail;

    @FindBy(css = "p#currentAddress")
    public WebElement resultCurrentAddress;

    @FindBy(css = "p#permanentAddress")
    public WebElement resultPermanentAddress;


    public Text_Box_Page input_userName(String name) {
        actions.type(userName, name);
        return this;
    }

    public Text_Box_Page input_userEmail(String email) {
        actions.type(userEmail, email);
        return this;
    }

    public Text_Box_Page input_currentAddress(String address) {
        actions.type(currentAddress, address);
        return this;
    }

    public Text_Box_Page input_permanentAddress(String address) {
        actions.type(permanentAddress, address);
        return this;
    }

    public Text_Box_Page click_Button() {
        actions.click(button);
        return this;
    }

    public String getNameResult() {
        return resultName.getText().replace("Name:", "").trim();
    }

    public String getEmailResult() {
        return resultEmail.getText().replace("Email:", "").trim();
    }

    public String getCurrentAddressResult() {
        return resultCurrentAddress.getText().replace("Current Address :", "").trim();
    }

    public String getPermanentAddressResult() {
        return resultPermanentAddress.getText().replace("Permananet Address :", "").trim();
    }

}
