package ua.hillel.test.filesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.hillel.test.BaseTest;

import java.io.File;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FilesTest extends BaseTest {
  @Test
  public void fileTest() {
    openApp();

    driver.findElement(By.linkText("File Upload")).click();

    driver.findElement(By.cssSelector("input[type='file']")).sendKeys(new File("test.txt").getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();
  }
}
