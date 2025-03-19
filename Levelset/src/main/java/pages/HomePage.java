package pages;

import org.openqa.selenium.WebDriver;
import Actions.ActionsHelper;

public class HomePage {
    private WebDriver driver;
    private ActionsHelper actions;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new ActionsHelper(driver);
    }

    public ActionsHelper actions() {
        return actions;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
