package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private static final String LOGIN_URL = "https://moodpanda.com/Login/";
    private static final String EMAIL_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    private static final String PASSWORD_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxPassword";
    private static final String LOGIN_BUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";

    public LoginPage openPage() {
        open(LOGIN_URL);
        return this;
    }

    public FeedPage login(String email, String pasword) {
        $(EMAIL_INPUT_CSS).sendKeys(email);
        $(PASSWORD_INPUT_CSS).sendKeys(pasword);
        $(LOGIN_BUTTON_CSS).click();
        return new FeedPage();
    }

}
