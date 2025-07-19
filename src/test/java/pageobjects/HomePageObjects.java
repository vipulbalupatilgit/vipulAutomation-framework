package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
    WebDriver driver;

    public HomePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    By signupLogin = By.xpath("//a[text()=' Signup / Login']");

    public void clickSignupLogin() {
        driver.findElement(signupLogin).click();
    }

    public boolean isSignupLoginDisplayed() {
        return driver.findElement(signupLogin).isDisplayed();
    }
}
