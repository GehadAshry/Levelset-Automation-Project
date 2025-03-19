package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test
    public void Check() {
        Assert.assertTrue(homePage.actions().isGetPaidBtnVisible(), "Get Paid button is not visible!");

        homePage.actions().hoverOverGetPaidBtn();
        homePage.actions().clickCreateOtherDocLnk();

       Assert.assertEquals(homePage.getTitle(),"Levelset | File Any Document in Minutes");

    }

}
