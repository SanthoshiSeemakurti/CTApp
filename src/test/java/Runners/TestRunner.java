package Runners;

import Utils.ConfigFileReader;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"},
        tags = "@CTApp",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = {"json:target/cucumber-reports/CucumberTestReport.json",
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {



                private TestNGCucumberRunner testNGCucumberRunner;
                /*
                 * AppiumDriverFactory appiumDriverFactory =
                 * AppiumDriverFactory.getInstanceOfAppiumDriverFactory(); AppiumDriver driver =
                 * appiumDriverFactory.getDriver();
                 */

                @BeforeClass(alwaysRun = true)
                public void setUpClass() throws Exception {
                        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
                }

                @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
                public void feature(CucumberFeatureWrapper cucumberFeature) {
                //        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
                }

                @DataProvider
                public Object[][] features() {
                        return testNGCucumberRunner.provideFeatures();
                }

                @AfterClass(alwaysRun = true)
                public void tearDownClass() throws Exception {
                        //driver.quit();
                        Reporter.loadXMLConfig(new File(ConfigFileReader.getConfigPropertyVal("reportConfigPath")));
                        testNGCucumberRunner.finish();



        }
}
