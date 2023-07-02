package page;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MobileHomePage  {

    AppiumDriver driver = null;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    /**
     * Page Objects
     **/
    private static final By headerActionBar = By.id("com.cottontradersltd.cottontraders:id/action_bar");


    public void launchApp() {
        driver = appiumDriverFactory.getDriver();
            androidUtils = new AndroidUtils(driver);
        if (androidUtils.objectExists(headerActionBar)) {
            System.out.println("Application Launched!");
            Assert.assertTrue(true, "Application Launched Successfully!");
        } else {
            Assert.assertTrue(false, "Unable to launch application!");
        }

    }
}