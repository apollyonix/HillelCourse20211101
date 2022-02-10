package ua.hillel.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaTest{
  private WebDriver driver;
  private WebDriverWait webDriverWait;
  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void rozetkaTest() {
    driver.get("https://rozetka.com.ua/");

    webDriverWait = new WebDriverWait(driver, 5);


    driver.findElement(By.id("fat-menu")).click();

    WebElement menuItem = driver.findElement(
        By.cssSelector(".menu-categories li.menu-categories__item:nth-of-type(3)"));

    Actions actions = new Actions(driver);

    actions.moveToElement(menuItem).perform();
    WebElement item = driver.findElement(By.xpath("//*[contains(@class, 'state_hovered')]//a[@class='menu__link menu__link_background_gray' and contains(text(), 'Видеокарты')]"));

    actions.moveToElement(item).click().perform();

    webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("aside.sidebar")));

    setFilter("Rozetka");
    setFilter("ASUS");
    setFilter("GeForce RTX 3090");

    WebElement card = driver.findElement(By.cssSelector(".catalog-grid__cell:nth-of-type(1)"));

    actions.moveToElement(card).perform();

    List<WebElement> descItems = card.findElements(By.cssSelector(".goods-tile__description-item"));
    descItems.forEach(descItem -> {
      System.out.print(descItem.findElement(By.tagName("span")).getText() + " - ");
      System.out.println(descItem.findElement(By.tagName("a")).getText());
    });

    card.click();

  }


  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  private void setFilter(String id) {
    webDriverWait.until(filterIsUnblocked(driver.findElement(By.cssSelector("aside"))));
    WebElement link = webDriverWait.until(ExpectedConditions
                                              .presenceOfElementLocated(By.xpath("//aside//a[contains(text(),'" + id + "')]/..")));
    webDriverWait.until(ExpectedConditions.elementToBeClickable(link));
    new Actions(driver).moveToElement(link).click().perform();
    webDriverWait.until(filterIsUnblocked(driver.findElement(By.cssSelector("aside"))));
  }

  private ExpectedCondition<Boolean> filterIsUnblocked(WebElement filters) {
    return new ExpectedCondition<Boolean>() {
      @NullableDecl
      @Override
      public Boolean apply(@NullableDecl WebDriver driver) {
        return !filters.getAttribute("class").contains("preloader_type_element");
      }
    };
  }

  private ExpectedCondition<Boolean> filterIsUnblockedLam(WebElement filters) {
    return (driver) -> !filters.getAttribute("class").contains("preloader_type_element");
  }
}
