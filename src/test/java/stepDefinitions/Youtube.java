package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.YoutubePage;

import static com.codeborne.selenide.Selenide.*;

public class Youtube {

    YoutubePage youtubePage = new YoutubePage();

    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        open(string);
        sleep(10000);
    }
    @Given("User clicks the {string}")
    public void user_clicks_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        youtubePage.sports.click();
        sleep(5000);
    }
    @Then("User see the {string}")
    public void user_see_the(String string) {
        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals(youtubePage.title.getText(), string);
        youtubePage.title.shouldHave(Condition.exactText(string));
        System.out.println("Positive");
        back();
    }

    @Then("User hold the browser")
    public void userHoldTheBrowser() {
        Configuration.holdBrowserOpen = true;
//        String source = WebDriverRunner.source();
//        Assert.assertTrue(source.contains("YouTube"));
//        System.out.println(youtubePage.ali.get(0).getText());
    }
}
