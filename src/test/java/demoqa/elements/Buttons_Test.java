package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttons_Test extends BaseTest {

    @Test
    void buttons_test() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        buttonsPage
                .doDoubleClick()
                .doRightClick()
                .doDynemicClick();
        Thread.sleep(5000);


        Assert.assertEquals(buttonsPage.getTextAfterClick(buttonsPage.doubleClickMessage), "You have done a double click");
        Assert.assertEquals(buttonsPage.getTextAfterClick(buttonsPage.rightClickMessage), "You have done a right click");
        Assert.assertEquals(buttonsPage.getTextAfterClick(buttonsPage.dynamicClickMessage), "You have done a dynamic click");

    }
}
