package ua.hille.pageObjects.rozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import ua.hille.pageObjects.rozetkaPages.util.ComponentFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductCardComponent {
  private WebElement parent;
  private WebDriver driver;

//  private By byPrice = By.cssSelector(".goods-tile__prices");

  @FindBy(css = ".goods-tile__prices")
  private WebElement price;

  public ProductCardComponent(WebElement parent) {
    this.parent = parent;
    PageFactory.initElements(new ComponentFactory(parent), this);
  }

  public String getPrice() {
    return price.getText();
  }
}
