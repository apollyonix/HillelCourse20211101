package ua.hillel.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.DriverManager;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaTest{
  private WebDriver driver;
  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void rozetkaTest() {
    driver.get("https://rozetka.com.ua/");
    driver.findElement(By.cssSelector("#fat-menu")).click();

    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.cssSelector(".menu-categories__item"))).perform();

    driver.findElement(By.partialLinkText("Видеокарты")).click();
    WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

    webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sidebar")));
    webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("aside.sidebar")), "class", "preloader_type_element")));

    setFilter("Rozetka");
    setFilter("ASUS");
    setFilter("GeForce RTX 3090");

    List<WebElement> productCards = driver.findElements(By.cssSelector(".catalog-grid__cell"));

    WebElement element = productCards.stream().filter(
        el -> !el.findElement(By.cssSelector(".goods-tile__availability")).getText()
            .equals("Нет в наличии")).findFirst().get();

    actions.moveToElement(element).click().build().perform();

    webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".tabs")));
    driver.findElement(By.cssSelector("li.tabs__item:nth-of-type(2)")).click();

    List<WebElement> characteristics = driver.findElements(By.cssSelector(".characteristics-full__list div"));

    Map<String, String> charMap = new HashMap<>();
    for (WebElement c : characteristics) {
      charMap.put(c.findElement(By.tagName("dt")).getText(), c.findElement(By.tagName("dd")).getText());
    }

    System.out.println(charMap);
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  private void setFilter(String filter) {
    driver.findElement(By.xpath("//label[contains(text(),'"+ filter +"')]/..")).click();
    WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
    webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("aside.sidebar")), "class", "preloader_type_element")));
  }
}
