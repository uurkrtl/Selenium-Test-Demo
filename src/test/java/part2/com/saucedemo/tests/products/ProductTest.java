package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.bases.BaseTest;

public class ProductTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductPage productPage = loginPage.loginToApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
    }
}
