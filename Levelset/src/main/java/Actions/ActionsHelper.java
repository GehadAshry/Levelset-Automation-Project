package Actions;

import Locators.ElementsLocators;
import Locators.LocatorsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsHelper extends LocatorsHelper {

    public ActionsHelper(WebDriver driver) {
        super(driver);
    }
    public boolean isGetPaidBtnVisible (){
       WebElement button = find(ElementsLocators.GetPaidBtn);
        return button.isDisplayed();
    }

    public void hoverOverGetPaidBtn (){
        WebElement get_paid_Btn = find(ElementsLocators.GetPaidBtn);
        Actions action = new Actions(driver);
        action.moveToElement(get_paid_Btn).perform();
    }

    public void clickCreateOtherDocLnk (){
        find(ElementsLocators.CreateOtherDocLnk).click();
    }

}