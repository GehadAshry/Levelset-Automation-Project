package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp (){
        driver = new ChromeDriver();
        driver.get("https://www.levelset.com");
        homePage = new HomePage(driver);
    }


    @AfterClass
    public void exit (){
        driver.quit();
    }
}
