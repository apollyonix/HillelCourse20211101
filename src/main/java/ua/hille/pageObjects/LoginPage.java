package ua.hille.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginPage extends BasePage {

  @FindBy(id = "username")
  private WebElement userNameInput;

  @FindBy(id = "password")
  private WebElement passwordInput;

  @FindBy(css = "button[type='submit']")
  private WebElement loginButton;

  @FindBy(css = ".flash.error")
  private WebElement errorAlert;

  public LoginPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public LoginPage setUsername(String username) {
    userNameInput.sendKeys(username);
    return this;
  }

  public LoginPage setPassword(String password) {
    passwordInput.sendKeys(password);
    return this;
  }

  public SecurePage clickLoginButton() {
    clickButton(loginButton);
    return new SecurePage(driver);
  }

  public SecurePage login(String username, String password) {
    this.setUsername(username);
    this.setPassword(password);
    return this.clickLoginButton();
  }

  public LoginPage invalidLogin(String username, String password) {
    //invalid cred
    return null;
  }

  public String getErrorMessage() {
    return errorAlert.getText();
  }
}
