package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DropDownPage;

import java.util.List;

public class Dropdown {
    DropDownPage dropDownPage = new DropDownPage();

    @And("User select the products")
    public void userSelectTheProducts() {
        dropDownPage.products.selectOption("Google");
        System.out.println(dropDownPage.products.getValue());
        Assert.assertEquals(dropDownPage.products.getValue(), "Google");
    }

    @And("User select the animals")
    public void userSelectTheAnimals() {
        dropDownPage.animals.selectOption(3);
        ElementsCollection animals =  dropDownPage.animalsList;
        for (SelenideElement animal: animals) {
            System.out.println(animal.getText());
        }
    }
}
