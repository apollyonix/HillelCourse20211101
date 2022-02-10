package ua.hillel.test.selenideTest;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.hille.pageObjects.selenidePages.DownloadPage;
import ua.hille.pageObjects.selenidePages.UploadPage;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileTest {
  @Test
  public void fileTest() {
    Configuration.browser = "chrome";
    Configuration.startMaximized = true;
    Configuration.downloadsFolder = "target/downloads";
    Configuration.baseUrl = "https://the-internet.herokuapp.com";

    open("/download");

    DownloadPage downloadPage = new DownloadPage();
    File file = downloadPage.downloadFile("dummy.txt");


    updateFile(file);

    open("/upload");

    UploadPage uploadPage = new UploadPage();
    uploadPage.uploadFile(file);
  }


  private void updateFile(File file) {
    try {
      Files.readAllLines(file.toPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }





}
