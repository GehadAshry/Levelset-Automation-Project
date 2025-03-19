package pages;

import Locators.ElementsLocators;
import Locators.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class DocumentsPage extends LocatorsHelper {

    public DocumentsPage(WebDriver driver) {
        super(driver);
    }
    //ternary expression to get the integer if ture or 0 if false
    public int getFreeDocumentCount (){
        return validateElement(ElementsLocators.FreeDocuments,ElementState.PRESENT,5)?
                findElements(ElementsLocators.FreeDocuments).size() : 0 ;
    }
    // to store the stream in an Array list
    public List<String> freeDocumentsNames(){
        return validateElement(ElementsLocators.FreeDocuments,ElementState.PRESENT,5)?
                findElements(ElementsLocators.FreeDocuments).stream().map(WebElement::getText).collect(Collectors.toList()) : List.of();
    }

    public List<String> paidDocuments(int minPrice, int maxPrice) {
        String dynamicXpath = String.format(ElementsLocators.PaidDocumentsInRange, minPrice, maxPrice);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dynamicXpath)));

        List<WebElement> paidDocuments = findElements(dynamicXpath);
        System.out.println("Found (" + paidDocuments.size() + ") paid documents in range of $" + minPrice + " and $" + maxPrice);

        return paidDocuments.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
