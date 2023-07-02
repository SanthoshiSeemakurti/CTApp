package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class NewInWomens extends BaseScreen {
    public NewInWomens(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void SeventhItemNavigation(String bottomNavigation) {
        mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
        mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
        AndroidElement eleSeventhItem = (AndroidElement) driver.findElement(By.xpath("com.cottontradersltd.cottontraders:id/product_card_image])[2]]"));

    }
}