package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ProductdetailPage extends BaseScreen {

     public ProductdetailPage(AndroidDriver<MobileElement> driver) {
          super(driver);
     }

     // Locators and actions
     public static void Item(String Item){
          mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
          mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
          AndroidElement eleItem = (AndroidElement) driver.findElement(By.xpath("(//*[@index=\"0\" and @class=\"android.widget.ImageView\" and @resource-id=\"com.cottontradersltd.cottontraders:id/product_card_image\"])[1]"));
          eleItem.click();
     }


     public static void ColourSelector(){
          mobileActions.verticalSwipeByPercentages(0.6, 0.3, 0.5);
          AndroidElement eleColour = (AndroidElement) driver.findElement(By.xpath("//*[@index=\"1\" and @resource-id=\"com.cottontradersltd.cottontraders:id/item_picker\"]"));
          eleColour.click();
     }

     public static void AddToBag(){
          AndroidElement eleAddToBag = (AndroidElement) driver.findElement(By.id("com.cottontradersltd.cottontraders:id/new_add_to_bag"));
          eleAddToBag.click();
     }

     public static void SnakeBar(){
          AndroidElement eleSnakeBar = (AndroidElement) driver.findElement(By.id("com.cottontradersltd.cottontraders:id/snackbar_text"));
     }
     public static void SizeSelector() {
          AndroidElement eleSize = (AndroidElement) driver.findElement(By.xpath(("//*[@index=\"0\" and @class = \"android.widget.LinearLayout\" and @resource-id=\"com.cottontradersltd.cottontraders:id/item_picker_container\"]")));
          eleSize.click();
     }
     public static void ViewBag() {
          AndroidElement eleViewBag = (AndroidElement) driver.findElement(By.id("com.cottontradersltd.cottontraders:id/action_bag"));
          eleViewBag.click();
     }
}

