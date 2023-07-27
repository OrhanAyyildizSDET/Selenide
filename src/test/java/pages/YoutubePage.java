package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class YoutubePage {
    public SelenideElement sports = $(By.xpath("//*[contains(text(), 'Sports')]"));
    public SelenideElement title = $(By.xpath(" //*[contains(text(), 'Sports') and @class='title style-scope ytd-guide-entry-renderer']"));
    public ElementsCollection ali = $$(By.xpath("//*[contains(text(), 'ali')]"));

    public List<SelenideElement> alis = $$(By.xpath("//*[contains(text(), 'ali')]"));
}
