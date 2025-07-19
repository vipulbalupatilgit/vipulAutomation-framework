package runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:reports/cucumber-report.html"},
        
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	 @BeforeSuite
   public void setup() {
       System.out.println("Setting up before suite...");
   }

   @AfterSuite
   public void teardown() {
       System.out.println("Cleaning up after suite...");
   }
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
//package runner;
//
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(
//    features = { "src/test/resources/features/login.feature" }, // ✅ Fixed path
//    glue = { "stepdefinitions" },                               // ✅ Make sure this package exists
//    tags = "@tags",                                             // ❗ Replace @tags with actual tag like @SmokeTest
//    plugin = {
//        "pretty",
//        "html:target/cucumber-html-report.html",
//        "json:target/cucumber.json",
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//    },
//    monochrome = true
//)
//public class TestRunner extends AbstractTestNGCucumberTests {
//
//    @BeforeSuite
//    public void setup() {
//        System.out.println("Setting up before suite...");
//    }
//
//    @AfterSuite
//    public void teardown() {
//        System.out.println("Cleaning up after suite...");
//    }
//}
//
