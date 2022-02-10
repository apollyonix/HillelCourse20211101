package ua.hille.pageObjects.selenidePages;

import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DownloadPage {
  public File downloadFile(String fileName) {
    try {
      return $(By.linkText(fileName)).download();
    } catch (FileNotFoundException e) {
      return null;
    }
  }
}
