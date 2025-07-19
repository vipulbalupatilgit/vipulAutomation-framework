package stepdefinitions;


	import pageactions.HomePageActions;
	import baseclass.BaseClass;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;

	public class HomePageStepDefinition {


		HomePageActions actions;

	    @Before
	    public void setUp() {
	        BaseClass.setupDriver();
	        actions = new HomePageActions();
	    }

	    @After
	    public void tearDown() {
	        BaseClass.tearDown();
	    }

	    @Given("user is on the home page")
	    public void user_is_on_home_page() {
	        BaseClass.getDriver().get("https://automationexercise.com/");
	    }

	    @Given("user clicks on Login link")
	    public void user_clicks_on_signup_login_link() {
	        actions.clickSignupLink();
	    }
	}