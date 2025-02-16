import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class AvitoTechTest extends BaseTest{

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

    @Test
    @DisplayName("Проверка редактирования объявления")
    public void test2() throws InterruptedException {
        open(baseUrl, HomePage.class)
                .inputSearch("ёлка")
                .clickItem()
                .clickEditIcon()
                .inputImageUrl("https://i.pinimg.com/736x/75/ab/7c/75ab7ce5b5aa8bf28522e297d0fded7c.jpg")
                .inputName("Ёлка новогодняя")
                .inputPrice(15000)
                .inputDescription("ёлка для новогоднего настроения")
                .clickCheckIcon();
    }

    @Test
    @DisplayName("Проверка поиска объявлений")
    public void test3() throws InterruptedException {
        open(baseUrl, HomePage.class)
                .inputSearch("ёлка");
    }
}
