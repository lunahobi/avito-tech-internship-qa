package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement createButton = $("button[class=\"chakra-button css-1xxuluc\"]:nth-of-type(3)");
    private final SelenideElement inputName= $("input[name='name']");
    private final SelenideElement inputPrice= $("input[name=price]");
    private final SelenideElement inputDescription= $("input[name=description]");
    private final SelenideElement inputImageUrl= $("input[name=imageUrl]");
    private final SelenideElement buttonSave= $("button[type=submit]");

    public HomePage clickOnCreate() {
        createButton.click();
        return this;
    }

    public HomePage inputName(String name) {
        inputName.setValue(name);
        return this;
    }
    public HomePage inputPrice(double price) {
        inputPrice.setValue(String.valueOf(price));
        return this;
    }

    public HomePage inputDescription(String description) {
        inputDescription.setValue(description);
        return this;
    }

    public HomePage inputImageUrl(String imageUrl) {
        inputImageUrl.setValue(imageUrl);
        return this;
    }

    public HomePage buttonSave() {
        buttonSave.click();
        return this;
    }

}
