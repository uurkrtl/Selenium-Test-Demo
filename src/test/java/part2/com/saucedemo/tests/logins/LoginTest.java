package part2.com.saucedemo.tests.logins;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.bases.BaseTest;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"));
    }
}
