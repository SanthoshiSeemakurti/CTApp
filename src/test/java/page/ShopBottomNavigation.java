package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ShopBottomNavigation extends BaseScreen {

    public ShopBottomNavigation(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    public void BottomNavigation(String bottomNavigation) {
        AndroidElement eleBottomNav = (AndroidElement) driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=" + bottomNavigation + "]"));
    }

    public void NavigatingtoSubcategory(String subcategoryValue) throws InterruptedException {
        subcategoryValue ="men>clothing>knitwear";
        String[] arrayCategory = subcategoryValue.split(">");
        AndroidElement headCat = (AndroidElement) driver.findElement(By.id(arrayCategory[0]));
        headCat.click();
        wait();
        AndroidElement subCat = (AndroidElement) driver.findElement(By.id(arrayCategory[1]));
        subCat.click();
        wait();
        mobileActions.verticalSwipeByPercentages(.6, .3, .5);
        AndroidElement subSubCat = (AndroidElement) driver.findElement(By.id(arrayCategory[2]));
        subSubCat.click();
        wait();
    }


//    public void iNavigateToMen_clothing_Knitwear(String AndroidDriver) {
//        mobileActions.tapByElement((AndroidElement) waitAndFindElements);
//        menLinkLocator = AndroidDriver.findElement(menLinkLocator);
//        navigationToMen.click();
//        mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
//        MobileActions swipeByElements ((AndroidElement) waitAndFindElements(navigationToMen).get);
//        navigationToMen.click();
//
//
//    }

}
