package com.demoqa.pages;

import com.demoqa.actions.Web_Element_Actions;
import com.demoqa.drivers.Driver_Manager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public Web_Element_Actions actions = new Web_Element_Actions();

    public BasePage() {
        PageFactory.initElements(Driver_Manager.getDriver(), this);
    }
}
