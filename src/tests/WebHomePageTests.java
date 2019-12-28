package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WebPageHomeHelper;

public class WebHomePageTests extends TestBase{
    WebPageHomeHelper webPageHome;

    @BeforeMethod
    public void initTests (){
        webPageHome = new WebPageHomeHelper(driver);
        webPageHome.waitUntilPageIsloaded();

    }

    @Test
    public void webHomePageTest()  {

        Assert.assertTrue(webPageHome.correctPageIsLoaded(),
                "'ListEvent' element is not displayed or 'Login' button is not displayed");
    }

    @Test
    public void webSingleFilterHolidayShabbat()  {
        webPageHome.filterByHolidayShabbat();
        Assert.assertTrue(webPageHome.eventsListBelongToShabbat(),"Not all events belong to holiday 'Shabbat'");

    }
}
