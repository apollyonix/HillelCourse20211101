package ua.hillel.test.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTest {
  private WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    this.driver = new ChromeDriver();
  }

  @Test
  public void loginTest() {
    driver.get("https://the-internet.herokuapp.com/");

    driver.findElement(By.linkText("Form Authentication")).click();

    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.cssSelector("button[type='submit']")).click();

    WebElement alert = new WebDriverWait(driver, 10)
        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flash.success")));
    Assert.assertTrue(alert.getText()
                          .contains("You logged into a secure area!"),
                      "User should be logged in");
  }

  @AfterClass
  public void tearDown() {
    if (this.driver != null) {
      this.driver.quit();
    }
  }
}
