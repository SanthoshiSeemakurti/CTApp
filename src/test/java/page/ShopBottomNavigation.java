package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ShopBottomNavigation extends BaseScreen{


    public ShopBottomNavigation(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public static void BottomNavigation(String bottomNavigation) {
        AndroidElement eleBottomNav = (AndroidElement) driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=" + bottomNavigation + "]"));
    }

    public static void NavigatingtoSubcategory(String subcategoryValue) throws InterruptedException {
        //subcategoryValue ="men>clothing>knitwear";
        String[] arrayCategory = subcategoryValue.split(">");
        AndroidElement headCat = (AndroidElement) driver.findElement(By.id(arrayCategory[0]));
        headCat.click();
        mobileActions.wait();
        AndroidElement subCat = (AndroidElement) driver.findElement(By.id(arrayCategory[1]));
        subCat.click();
        mobileActions.wait();
        mobileActions.verticalSwipeByPercentages(.6, .3, .5);
        AndroidElement subSubCat = (AndroidElement) driver.findElement(By.id(arrayCategory[2]));
        subSubCat.click();
        mobileActions.wait();
    }

}
