import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class AvitoTechTest {

    private final String baseUrl = "http://tech-avito-intern.jumpingcrab.com";

    @Test
    @DisplayName("Проверка создания объявления")
    public void test1(){
        open(baseUrl, HomePage.class)
                .clickOnCreate()
                .inputName("Ёлка")
                .inputPrice(12000)
                .inputDescription("ёлка для настроения")
                .inputImageUrl("https://i.pinimg.com/736x/64/07/d5/6407d5aefe7605fb89bbffb252c10922.jpg")
                .buttonSave();
    }
}
