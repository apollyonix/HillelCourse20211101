package ua.hillel.test.wdTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.test.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTest extends BaseTest {

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
}
