package demoqa.elements;

import demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check_Box_Test extends BaseTest {

    @Test
    public void check_Box_Page_Test() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");

        checkBoxPage.clickExpandAll();
        Thread.sleep(1000); // Ожидание раскрытия всех элементов

        String[] items = {
                "Home",
                "Desktop",
                "Notes",
                "Commands",
                "Documents",
                "WorkSpace",
                "React",
                "Angular",
                "Veu",
                "Office",
                "Public",
                "Private",
                "Classified",
                "General",
                "Downloads",
                "Word File.doc",
                "Excel File.doc"
        };

        for (String item : items) {
            // Кликаем и проверяем, что чекбокс отмечен
            checkBoxPage.toggleCheckbox(item);
            Thread.sleep(200); // Небольшая задержка для обновления DOM
            Assert.assertTrue(checkBoxPage.isCheckboxChecked(item),
                    item + " should be checked");

            // Кликаем снова и проверяем, что чекбокс не отмечен
            checkBoxPage.toggleCheckbox(item);
            Thread.sleep(200); // Небольшая задержка для обновления DOM
            Assert.assertFalse(checkBoxPage.isCheckboxChecked(item),
                    item + " should be unchecked");
        }
        checkBoxPage.clickCollapseAll();
    }
}

