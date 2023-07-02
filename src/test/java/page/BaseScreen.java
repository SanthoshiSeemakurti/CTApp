package page;

import Utils.MobileActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {
    protected static AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;
    protected static MobileActions mobileActions;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        mobileActions = new MobileActions(driver);
    }

}