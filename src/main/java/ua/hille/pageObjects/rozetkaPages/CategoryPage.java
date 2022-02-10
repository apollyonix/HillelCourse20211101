package ua.hille.pageObjects.rozetkaPages;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CategoryPage {
  private List<WebElement> products;

  public String getProductPrice(int index) {
    return new ProductCardComponent(products.get(index)).getPrice();
  }
}
