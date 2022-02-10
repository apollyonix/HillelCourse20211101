package ua.hillel.test.wdTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hille.pageObjects.SecurePage;
import ua.hillel.test.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPO extends BaseTest {

  @Test
  public void loginTest() {

    SecurePage securePage = openApp().goToLoginPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLoginButton();
    String alertText = securePage.getAlertText();

    securePage.logout();

    Assert.assertTrue(alertText.contains("You logged into a secure area!"));

  }


}
