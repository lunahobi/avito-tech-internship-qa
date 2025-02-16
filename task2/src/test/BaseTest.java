import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    @Before
    public void init(){
        setUp();

        // Добавляем слушатель AllureSelenide
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true) // Скриншоты при ошибках
                .includeSelenideSteps(false)
                .savePageSource(false));
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }

}
