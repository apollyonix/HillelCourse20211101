package ua.hillel.test.selenideTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideTests {
  @Test
  public void selenideTest() {
    Configuration.browser = "firefox";
    Configuration.timeout = 10;

    open("http://google.com");

    $("#id").should(Condition.visible).should(Condition.enabled).click();





    System.out.println("done");
  }
}
