package ua.hille.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @Step("Go to Login Page")
  public LoginPage goToLoginPage() {
    driver.findElement(By.linkText("Form Authentication")).click();
    return new LoginPage(driver);
  }
}
