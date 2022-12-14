package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("WikipediaWebTest")
    void generatedTest() {
        step("https://en.wikipedia.org/wiki/Main_Page", () -> {
            step("// todo: just add selenium action");
        });

        step("В поле поиска ввести слово \"Java\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на кнопку \"Поиск\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить что список результатов не пуст", () -> {
            step("// todo: just add selenium action");
        });

        step("Выбрать первую статью из результатов поиска", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть неё", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить что на странице есть текст содержащий слово \"Java\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://en.wikipedia.org/wiki/Main_Page'", () ->
            open("https://en.wikipedia.org/wiki/Main_Page"));

        step("Page title should have text 'Wikipedia, the free encyclopedia'", () -> {
            String expectedTitle = "Wikipedia, the free encyclopedia";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://en.wikipedia.org/wiki/Main_Page'", () ->
            open("https://en.wikipedia.org/wiki/Main_Page"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}