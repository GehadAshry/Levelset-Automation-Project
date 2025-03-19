package Locators;

public class ElementsLocators {
    // Home Page Locators
    public static final String GetPaidBtn = "//a[contains(@class, 'btn') and contains(@href, 'SelectDocument') and contains(text(), 'Get paid')]";
    public static final String CreateOtherDocLnk = "//a[contains(@href, 'SelectDocument') and contains(text(), 'Create other documents')]";

    // Free Documents
    public static final String FreeDocuments = "//span[@class='price-amount' and text()='Free']/ancestor::div[contains(@class,'left-right-pair')]/div[@class='left']";

    // Paid Documents
    public static final String PaidDocumentsInRange = "//span[contains(@class , 'price-amount') and number(translate(text(),'$','')) >= %d and number(translate(text(),'$','')) <= %d ]"
            + "/ancestor::div[contains(@class,'left-right-pair')]/div[@class='left']";
}
