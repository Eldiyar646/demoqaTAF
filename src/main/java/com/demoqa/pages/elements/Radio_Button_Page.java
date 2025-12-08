package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Radio_Button_Page extends BasePage {

    @FindBy(css = "label[for='yesRadio']")
    public WebElement yes_button;

    @FindBy(css = "label[for='impressiveRadio']")
    public WebElement impressive_button;

    @FindBy(xpath = "//p[contains(text(),'You have selected')]")
    public WebElement result_Text;


    public Radio_Button_Page clickYes_Radio_Button(){
        actions.click(yes_button);
        return this;
    }

    public Radio_Button_Page clickImpressive_Radio_Button(){
        actions.click(impressive_button);
        return this;
    }

    public String getResultText (){
        return result_Text.getText();
    }
}
