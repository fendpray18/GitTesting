package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	@Given("Initialize the browser with Chrome")
	public void initialize_the_browser_with_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Open browser Chrome");
	}
	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	@Given("Click on login link as Direct to icon Login")
	public void click_on_login_link_as_direct_to_icon_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate Login Page");
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
		
	}
	@Then("verify that user is successfully logged in knowing the icon Profile")
	public void verify_that_user_is_successfully_logged_in_knowing_the_icon_profile() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Succesfully logged");
	}

}
