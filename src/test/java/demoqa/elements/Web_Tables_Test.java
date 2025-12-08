package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Web_Tables_Test extends BaseTest {

    @Test
    public void webTables_Page_Test() {
        driver.get("https://demoqa.com/webtables");

        String example_email = "test@test.com";

        String randomFirstName = services.generateRandomUserFirstName();
        String randomLastName = services.generateRandomUserLastName();
        String randomEmail = services.generateRandomUserEmail();
        String randomUserAge = services.generateRandomUserAge();
        String randomSalary = services.generateRandomUserSalary();
        String randomDepartment = services.generateRandomUserDepartment();

        webTablesPage.click_Add_Button()
                .input_firstName(randomFirstName)
                .input_lastName(randomLastName)
                .input_userEmail(randomEmail)
                .input_age(randomUserAge)
                .input_salary(randomSalary)
                .input_department(randomDepartment)
                .click_Button().getHeader();

        webTablesPage.getTable();

        Assert.assertTrue(
                webTablesPage.isEmailPresent(randomEmail),
                "User with email " + randomEmail + " not found in table");


    }

}
