package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LocatorsHelper {
    protected WebDriver driver;

    public LocatorsHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    protected List<WebElement> findElements(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public enum ElementState {
        VISIBLE, CLICKABLE, PRESENT
    }

    //  Element Validation
    public boolean validateElement(String xpath, ElementState state, int timeout) {
        By locator = By.xpath(xpath);
        ExpectedCondition<WebElement> condition = switch (state) {
            case VISIBLE -> ExpectedConditions.visibilityOfElementLocated(locator);
            case CLICKABLE -> ExpectedConditions.elementToBeClickable(locator);
            case PRESENT -> ExpectedConditions.presenceOfElementLocated(locator);
        };
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(condition);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
