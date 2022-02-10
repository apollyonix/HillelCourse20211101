package ua.hille.pageObjects.rozetkaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HeaderComponent {
  private WebElement searchInput;

  private WebElement cartIcon;

  public HeaderComponent() {
//    PageFactory.initElements(null, this);
  }

  public void search(String product) {
    searchInput.sendKeys(product);
  }

  public void goToCart() {
    cartIcon.click();
  }
}
