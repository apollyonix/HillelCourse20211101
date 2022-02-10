package ua.hillel.test.filesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.hillel.test.BaseTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DownloadTest extends BaseTest {
  @Test
  public void downloadTest() throws IOException {
    openApp();
    driver.findElement(By.linkText("File Download")).click();


    driver.findElement(By.linkText("some-file.txt")).click();
//    waitForFileToDownload("some-file.txt");

    File file = new File("target/download/some-file.txt");


    Path path = Paths.get("target/download/some-file.txt").toAbsolutePath();
    Files.readAllLines(path).forEach(System.out::println);

    openApp();
    driver.findElement(By.linkText("File Upload")).click();

    driver.findElement(By.cssSelector("input[type='file']")).sendKeys(file.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();


  }

  private void waitForFileToDownload(String fileName) {
    int attemp=0;
    do {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (++attemp > 10) {
        throw new RuntimeException("File is not downloaded");
      }
    } while (!new File("target/download/" + fileName).exists());

  }
}
