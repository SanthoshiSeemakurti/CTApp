package StepDef;

import Utils.MobileActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.MobileHomePage;
import java.util.List;

public class Steps {
private WebDriver driver;
private Steps steps;
//private By driver.CottonTradersAppLocator = By.accessibility.id("Cotton Traders");
public MobileHomePage mobileHomePage = new MobileHomePage();
public MobileActions mobileActionUtils = new MobileActionUtils();


    @Given("Hit the url on the mobile app")
    public void hit_the_url_on_the_mobile_app() {

    }
    @Given("I launch the app Cotton Traders")
    public void i_launch_the_app_cotton_traders() {
        WebElement LaunchCottonTradersAppLink =driver.findElement(new MobileBy.ByAccessibilityId ("Cotton Traders"));
        LaunchCottonTradersAppLink.click();


    }
    @When("I Navigate to {string} bottom navigation")
    public void i_navigate_to_bottom_navigation(String string) {


    }
    @When("I Navigate to {string}")
    public void i_navigate_to(String string) {


    }
    @Then("I Select the Seventh item displayed")
    public void i_select_the_seventh_item_displayed() {


    }
    @Then("I Select a colour")
    public void i_select_a_colour() {


    }
    @Then("I Add to Bag")
    public void i_add_to_bag() {

    }
    @Then("I select a size")
    public void i_select_a_size() {

    }
    @Then("I view Snack bar")
    public void i_view_snack_bar() {

    }
    @Then("I View Bag")
    public void i_view_bag() {

    }
}
