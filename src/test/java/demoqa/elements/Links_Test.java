package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Links_Test extends BaseTest {

    @Test
    void test_simpleLink() throws InterruptedException {
        driver.get("https://demoqa.com/links");

        linksPage.newSimpleLinkAndNewTab();
        Assert.assertTrue(driver.getWindowHandles().size() > 1);

        Set<String> windowHandles = driver.getWindowHandles();

        String originalWindow = driver.getWindowHandle();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demoqa.com/",
                "Incorrect URL opened in new tab"
        );
    }

    @Test
    void test_DynamicLink() {
        driver.get("https://demoqa.com/links");

        linksPage.newDynamicLink();
        Assert.assertTrue(driver.getWindowHandles().size() > 1);

        Set<String> windowHandles = driver.getWindowHandles();

        String originalWindow = driver.getWindowHandle();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demoqa.com/",
                "Incorrect URL opened in new tab"
        );
    }

    @Test
    void test_apiCalls() throws InterruptedException {
        driver.get("https://demoqa.com/links");

        linksPage.createdLink();
        String createdMessage = linksPage.getTextAfterClick("");
        Assert.assertEquals(
                createdMessage,
                "Link has responded with staus 201 and status text Created"
        );

        linksPage.noContentLink();
        String noContentMessage = linksPage.getTextAfterClick(createdMessage);
        Assert.assertEquals(
                noContentMessage,
                "Link has responded with staus 204 and status text No Content"
        );

        linksPage.movedLink();
        String movedMessage = linksPage.getTextAfterClick(noContentMessage);
        Assert.assertEquals(
                movedMessage,
                "Link has responded with staus 301 and status text Moved Permanently");

        linksPage.badRequestLink();
        String badRequestMessage = linksPage.getTextAfterClick(movedMessage);
        Assert.assertEquals(
                badRequestMessage,
                "Link has responded with staus 400 and status text Bad Request");

        linksPage.unauthorizedLink();
        String unauthorizedMessage = linksPage.getTextAfterClick(badRequestMessage);
        Assert.assertEquals(
                unauthorizedMessage,
                "Link has responded with staus 401 and status text Unauthorized");

        linksPage.forbiddenLink();
        String forbiddeMessage = linksPage.getTextAfterClick(unauthorizedMessage);
        Assert.assertEquals(
                forbiddeMessage,
                "Link has responded with staus 403 and status text Forbidden");

        linksPage.notFoundLink();
        String notFoundMessage = linksPage.getTextAfterClick(forbiddeMessage);
        Assert.assertEquals(
                notFoundMessage,
                "Link has responded with staus 404 and status text Not Found");
    }
}