package pageactions;


import baseclass.BaseClass;
import pageobjects.HomePageObjects;

public class HomePageActions {
	HomePageObjects homePage = new HomePageObjects(BaseClass.getDriver());

    public void clickSignupLink() {
        homePage.clickSignupLogin();
    }

    public boolean validateSignupLinkVisible() {
        return homePage.isSignupLoginDisplayed();
    }
}
