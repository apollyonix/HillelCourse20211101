package ua.hillel.test.wdTest.rozetkaTest;

import org.testng.annotations.Test;
import ua.hille.pageObjects.rozetkaPages.CategoryPage;
import ua.hille.pageObjects.rozetkaPages.MainPage;
import ua.hille.pageObjects.rozetkaPages.ProductPage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaCompTest {
  @Test
  public void rozCompTest() {
    MainPage mainPage = new MainPage();

    mainPage.header.goToCart();

    ProductPage productPage = new ProductPage();

    productPage.header.search("test");


    new CategoryPage().getProductPrice(4);
    new CategoryPage().getProductPrice(2);
    new CategoryPage().getProductPrice(1);
  }
}
