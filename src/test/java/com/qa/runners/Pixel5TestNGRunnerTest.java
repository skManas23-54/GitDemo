package com.qa.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/Pixel5/cucumber",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/Pixel5/cucumber-html-reports"
        }
//        ,dryRun = true
        , monochrome = true
//        , tags = "@DigitalGold"
        , glue = {"stepdef"}
        , features = {"D:/Selenium/FirstAppiumProject/src/test/resources/features"}
)
public class Pixel5TestNGRunnerTest  {


}