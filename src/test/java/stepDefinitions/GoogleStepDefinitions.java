package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;

public class GoogleStepDefinitions {
    private int a = 1000;

    @Given("I navigate to {string}")
    public void i_navigate_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        open(string);
        sleep(a*5);
    }
    @Given("I wait there a few moments")
    public void i_wait_there_a_few_moments() {
        // Write code here that turns the phrase above into concrete actions
        sleep(a*3);
    }
    @Given("I navigate back")
    public void i_navigate_back() {
        // Write code here that turns the phrase above into concrete actions
        back();
        sleep(3);
    }
    @Given("I navigate forward")
    public void i_navigate_forward() {
        // Write code here that turns the phrase above into concrete actions
        forward();
        sleep(a*3);
    }
    @Given("I refresh the page")
    public void i_refresh_the_page() {
        // Write code here that turns the phrase above into concrete actions
        refresh();
        sleep(2);
    }
    @Then("I hold the browser again")
    public void i_hold_the_browser_again() {
        // Write code here that turns the phrase above into concrete actions
        Configuration.holdBrowserOpen = true;
        sleep(5);
        Configuration.holdBrowserOpen = false;
    }

}
