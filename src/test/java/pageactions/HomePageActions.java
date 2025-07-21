package pageactions;


import pageobjects.HomePageObjects;
import testBase.BaseClass;

public class HomePageActions {
	HomePageObjects homePage = new HomePageObjects(BaseClass.getDriver());

    public void clickSignupLink() {
        homePage.clickSignupLogin();
    }

    public boolean validateSignupLinkVisible() {
        return homePage.isSignupLoginDisplayed();
    }
}
