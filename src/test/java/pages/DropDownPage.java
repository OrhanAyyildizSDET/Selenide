package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDownPage {
    public SelenideElement products = $(By.xpath("//select[@id='first']"));
    public SelenideElement animals = $(By.cssSelector("#animals"));
    public ElementsCollection animalsList = $$(By.cssSelector("#animals option"));
}
