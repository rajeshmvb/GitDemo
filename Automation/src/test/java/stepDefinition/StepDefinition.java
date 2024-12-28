package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("User  is on Landing Page")
    public void user_is_on_landing_page() {
        // Set the path for the ChromeDriver
		System.out.println("user_is_on_landing_page");
        
    }

    @When("User  Login to Application Using User Name and Password")
    public void user_login_to_application_using_user_name_and_password() {
    	System.out.println("user_login_to_application_using_user_name_and_password");
            }

    @Then("Home Page is Populated")
    public void home_page_is_populated() {
    	System.out.println("home_page_is_populated");
            }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
    	System.out.println("cards_are_displayed");
           }


}
