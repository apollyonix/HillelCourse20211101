package ua.hillel.test.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WebDriverTest {
  @Test public void wdTest(String browser) {
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.get("https://google.com");

    driver.close();

    driver.getTitle();
    driver.quit();



    List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));

    for (WebElement cell : cells) {
      cell.getText();
    }

    cells.stream().map(c -> c.getText()).forEach(System.out::println);

  }
}
