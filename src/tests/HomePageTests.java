package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageHelper;


public class HomePageTests extends TestBase {
    HomePageHelper homePage;

    @BeforeMethod
    public void initTests(){
        homePage = new HomePageHelper(driver);
        homePage.waitUntilPageIsLoaded();

    }

    @Test
    public void homePageVerificationTest()  {

        Assert.assertTrue(homePage.correctPageIsLoaded(),
                "Name of the listEvent element is not 'List events'");
    }

    @Test
    public void singleFilterHolidaysByShabbat()  {
        homePage.filterEventsByHolidayShabbat();
        Assert.assertTrue(homePage.allEventsBelongToHolidayShabbat());
    }



}
