package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By USERNAME_FIELD = By.id("user-name");
    private final By PASSWORD_FIELD = By.id("password");
    private final By LOGIN_FIELD = By.id("login-button");
    private final By ERROR_MESSAGE = By.cssSelector("#login_button_container h3");

    public void setUsername(String username) {
        set(USERNAME_FIELD, username);
    }

    public void setPassword(String password) {
        set(PASSWORD_FIELD, password);
    }

    public ProductPage clickLoginButton() {
        click(LOGIN_FIELD);
        return new ProductPage();
    }

    public ProductPage loginToApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(ERROR_MESSAGE).getText();
    }
}
