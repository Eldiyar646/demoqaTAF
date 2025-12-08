package demoqa;

import com.demoqa.data.MockData_Services;
import com.demoqa.drivers.Driver_Manager;
import com.demoqa.pages.elements.Check_Box_Page;
import com.demoqa.pages.elements.Radio_Button_Page;
import com.demoqa.pages.elements.Text_Box_Page;
import com.demoqa.pages.elements.Web_Tables_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public MockData_Services services;
    public Text_Box_Page textBoxPage;
    public Check_Box_Page checkBoxPage;
    public Radio_Button_Page radioButtonPage;
    public Web_Tables_Page webTablesPage;




    @BeforeClass(alwaysRun = true)
    public void setupBrowser(){
        driver = Driver_Manager.getDriver();
        services = new MockData_Services();
        textBoxPage = new Text_Box_Page();
        checkBoxPage = new Check_Box_Page();
        radioButtonPage = new Radio_Button_Page();
        webTablesPage = new Web_Tables_Page();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown (){
        Driver_Manager.closeDriver();
    }
}
