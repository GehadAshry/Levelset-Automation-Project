package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DocumentsPage;

import java.util.List;

public class DocumentsTest extends BaseTest {
    private DocumentsPage documentsPage;

    @BeforeClass
    public void setUpDocumentsPage() {
        // Navigation
        homePage.actions().hoverOverGetPaidBtn();
        homePage.actions().clickCreateOtherDocLnk();

        documentsPage = new DocumentsPage(driver);
    }

    @Test
    public void validateFreeDocuments() {
        List<String> freeDocs = documentsPage.freeDocumentsNames();
        System.out.println("Free Documents: " + freeDocs);

        Assert.assertEquals(documentsPage.getFreeDocumentCount()
                , 2, "Free document count is incorrect!");

        List<String> expectedFreeDocs = List.of("Exchange a Waiver", "Send a Payment Document");
        Assert.assertEquals(freeDocs, expectedFreeDocs, "Free document names do not match!");
    }

    @Test
    public void validatePaidDocuments() {
        int minPrice = 30, maxPrice = 60;
        List<String> paidDocs = documentsPage.paidDocuments(minPrice, maxPrice);
        System.out.println("Paid Documents ($" + minPrice + " - $" + maxPrice + "): " + paidDocs);

        Assert.assertEquals(paidDocs.size(), 1, "Paid document count is incorrect!");

        List<String> expectedPaidDocs = List.of("Send a Warning");
        Assert.assertEquals(paidDocs, expectedPaidDocs, "Paid document names do not match!");
    }
}
