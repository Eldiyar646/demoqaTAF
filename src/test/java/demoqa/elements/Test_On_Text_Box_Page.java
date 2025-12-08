package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_On_Text_Box_Page extends BaseTest {

    @Test
    public void text_Box_Page_Test(){
        driver.get("https://demoqa.com/text-box");

        String randomFullName = services.generateRandomUserFullName();
        String randomEmail = services.generateRandomUserEmail();
        String randomCurrentAddress = services.generateRandomCurrentAddress();
        String randomPermanentAddress = services.generateRandomPermanentAddress();

        textBoxPage.input_userName(randomFullName)
                .input_userEmail(randomEmail)
                .input_currentAddress(randomCurrentAddress)
                .input_permanentAddress(randomPermanentAddress)
                .click_Button();

        Assert.assertEquals(textBoxPage.getNameResult(), randomFullName, "Names not equals");
        Assert.assertEquals(textBoxPage.getEmailResult(), randomEmail, "Emails not equals");
        Assert.assertEquals(textBoxPage.getCurrentAddressResult(), randomCurrentAddress, "Current address not equals");
        Assert.assertEquals(textBoxPage.getPermanentAddressResult(), randomPermanentAddress, "Permanent address not equals");




    }


}
