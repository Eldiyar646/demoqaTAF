package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Web_Tables_Page extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "age")
    public WebElement userAge;

    @FindBy(id = "salary")
    public WebElement userSalary;

    @FindBy(id = "department")
    public WebElement userDepartment;

    @FindBy(id = "submit")
    public WebElement button;

    @FindBy(css = ".rt-tr-group")
    public List<WebElement> tables;

    @FindBy(css = ".rt-th")
    public List<WebElement> headers;

    public Web_Tables_Page click_Add_Button() {
        actions.click(addButton);
        return this;
    }

    public Web_Tables_Page input_firstName(String name) {
        actions.type(firstName, name);
        return this;
    }

    public Web_Tables_Page input_lastName(String name) {
        actions.type(lastName, name);
        return this;
    }

    public Web_Tables_Page input_userEmail(String email) {
        actions.type(userEmail, email);
        return this;
    }

    public Web_Tables_Page input_age(String age) {
        actions.type(userAge, age);
        return this;
    }

    public Web_Tables_Page input_salary(String salary) {
        actions.type(userSalary, salary);
        return this;
    }

    public Web_Tables_Page input_department(String department) {
        actions.type(userDepartment, department);
        return this;
    }

    public Web_Tables_Page click_Button() {
        actions.click(button);
        return this;
    }

    public void getHeader() {
        headers.forEach(h -> System.out.print(h.getText() + " | "));
        System.out.println();
    }

    public void getTable() {
        for (WebElement table : tables) {
            List<WebElement> cells = table.findElements(By.cssSelector(".rt-td"));

            if (cells.isEmpty()) continue;

            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println();
        }
    }

    public boolean isEmailPresent(String email) {
        return tables.stream().anyMatch(table -> table.getText().contains(email));
    }
}