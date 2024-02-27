package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@DisplayName("Мобильное тестирование сервиса главной страницы")
public class SearchTests extends TestBase {

    @Test
    @DisplayName("Поиск статьи через строку поиска")
    void checkResultTest() {
        step("Ищем статью через строку поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("JUnit");
        });

        step("Проверяем результаты поиска", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }


    @Test
    @DisplayName("Открытие первой статьи")
    void successfulSearchTest() {
        step("Ищем статью через строку поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenoid");
        });

        step("Нажимаем на первую статью", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click());

        step("Проверяем отображение ошибки", () ->
                $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(visible));
    }



    @Test
    @DisplayName("Проверка корректного ввода и совпадения введенного текста в выпадающем списке")
    void checkDescriptionTest() {
        step("Ищем статью через строку поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("JUnit");
        });

        step("Проверяем выпадающий название статьи в выпадающем списке", () ->
                $(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(text("JUnit")));
    }

}

