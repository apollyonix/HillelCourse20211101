package ua.hille.pageObjects.selenidePages;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UploadPage {
  public UploadPage uploadFile(File file) {
    $("#file-upload").uploadFile(file);
    $("#file-submit").click();
    return this;
  }
}
