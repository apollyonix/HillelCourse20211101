package ua.hille.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SecurePage extends BasePage {
  private By byAlert = By.cssSelector(".flash.success");

  public SecurePage(WebDriver driver) {
    super(driver);
  }

  public String getAlertText() {
    return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byAlert)).getText();
  }

  @Step("Click Logout and return to Home page")
  public LoginPage logout() {
    this.driver.findElement(By.cssSelector(".button.secondary.radius")).click();
    return new LoginPage(driver);
  }
}
