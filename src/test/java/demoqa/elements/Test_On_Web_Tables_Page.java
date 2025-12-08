package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_On_Web_Tables_Page extends BaseTest {

    @Test
    public void webTables_Page_Test() {
        driver.get("https://demoqa.com/webtables");

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
                .click_Button().getTable();

        Assert.assertTrue(
                webTablesPage.isEmailPresent(randomEmail),
                "User with email " + randomEmail + " not found in table");
        Assert.assertFalse(
                webTablesPage.isEmailPresent("test@test.com"),
                "Unexpected user found in table"
        );

    }

}
