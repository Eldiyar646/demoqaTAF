
package com.demoqa.pages.elements;

import com.demoqa.drivers.Driver_Manager;
import com.demoqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Check_Box_Page extends BasePage {

    @FindBy(xpath = "//button[@title='Expand all']")
    public WebElement expandAll;

    @FindBy(xpath = "//button[@title='Collapse all']")
    public WebElement collapseAll;


    public Check_Box_Page clickExpandAll() {
        actions.click(expandAll);
        return this;
    }

    public WebElement getCheckBox(String name){
        return Driver_Manager.getDriver().findElement(
                By.xpath("//span[@class='rct-title' and text()='"+ name +"']/../span[@class='rct-checkbox']"));
    }

    public Check_Box_Page toggleCheckbox(String name) {
        actions.click(getCheckBox(name));
        return this;
    }

    public boolean isCheckboxChecked(String name) {
        WebElement checkbox = getCheckBox(name).findElement(By.tagName("svg"));
        return checkbox.getAttribute("class").contains("rct-icon-check");
    }

    public boolean isCheckboxUnchecked(String name) {
        WebElement checkbox = getCheckBox(name).findElement(By.tagName("svg"));
        return checkbox.getAttribute("class").contains("rct-icon-uncheck");
    }

    public Check_Box_Page clickCollapseAll() {
        actions.click(collapseAll);
        return this;
    }










}
