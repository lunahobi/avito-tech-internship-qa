package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {
    private final SelenideElement editIcon= $("div.css-nb383z svg");
    private final SelenideElement inputName= $("input[name='name']");
    private final SelenideElement inputPrice= $("input[name=price]");
    private final SelenideElement textareaDescription= $("textarea[name=description]");
    private final SelenideElement inputImageUrl= $("input[name=imageUrl]");
    private final SelenideElement checkIcon= $("div.css-nb383z svg");

    public ItemPage clickEditIcon() {
        editIcon.click();
        return this;
    }

    public ItemPage inputName(String name) {
        inputName.setValue(name);
        return this;
    }

    public ItemPage inputPrice(double price) {
        inputPrice.setValue(String.valueOf(price));
        return this;
    }
    public ItemPage inputDescription(String description) {
        textareaDescription.setValue(description);
        return this;
    }

    public ItemPage inputImageUrl(String imageUrl) {
        inputImageUrl.setValue(imageUrl);
        return this;
    }

    public ItemPage clickCheckIcon() {
        checkIcon.click();
        return this;
    }

}
