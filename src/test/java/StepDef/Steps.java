package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.MobileHomePage;
import page.ProductdetailPage;
import page.ShopBottomNavigation;

public class Steps {
private WebDriver driver;
private Steps steps;

public MobileHomePage mobileHomePage = new MobileHomePage();
public ShopBottomNavigation shopBottomNavigation= new ShopBottomNavigation();
//public MobileActions mobileActionUtils = new MobileActionUtils();


    @Given("I launch the app Cotton Traders")
    public void i_launch_the_app_cotton_traders() {
        mobileHomePage.launchApp();

//        WebElement LaunchCottonTradersAppLink =driver.findElement(new MobileBy.ByAccessibilityId ("Cotton Traders"));
//        LaunchCottonTradersAppLink.click();
        }
    @When("I Navigate to {string} bottom navigation")
    public void i_navigate_to_bottom_navigation(String string) {
        ShopBottomNavigation.BottomNavigation("Shop");

    }
    @When("I Navigate to {string}")
    public void i_navigate_to(String string) {
        ShopBottomNavigation.NavigatingtoSubcategory("Men>Clothing>Knitwear");


    }
    @Then("I Select the Seventh item displayed")
    public void i_select_the_seventh_item_displayed() {
        ProductdetailPage.SeventhItem("2");

    }
    @Then("I Select a colour")
    public void i_select_a_colour() {
        ProductdetailPage.ColourSelector();
    }
    @Then("I Add to Bag")
    public void i_add_to_bag() {
        ProductdetailPage.AddToBag();
    }
    @Then("I select a size")
    public void i_select_a_size() {
        ProductdetailPage.SizeSelector();

    }
    @Then("I view Snack bar")
    public void i_view_snack_bar() {
        ProductdetailPage.SnakeBar();
    }
    @Then("I View Bag")
    public void i_view_bag() {

    }
}
