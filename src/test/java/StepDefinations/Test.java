package StepDefinations;

import io.cucumber.java.en.*;

public class Test {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given Method");

    }

    @When("user enter username and password")
    public void user_enter_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When Method");

    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("And Method");
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then Method");

    }


}
