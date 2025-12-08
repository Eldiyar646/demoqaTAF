package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_On_Radio_Button_Page extends BaseTest {

    @Test
    public void yes_Radio_Button_Page_Test() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");

        radioButtonPage.clickYes_Radio_Button();
        Assert.assertEquals(radioButtonPage.getResultText(), "You have selected Yes");
        Thread.sleep(3000);
    }

    @Test
    public void impressive_Radio_Button_Page_Test() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");

        radioButtonPage.clickImpressive_Radio_Button();
        Assert.assertEquals(radioButtonPage.getResultText(), "You have selected Impressive");
        Thread.sleep(3000);

    }
}
