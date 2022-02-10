package ua.hille.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ConfigClass {
  public String getPropertyValue() throws InterruptedException, FileNotFoundException {
    File configFile = new File("asdasd");
    FileReader reader = new FileReader(configFile);

    Thread.sleep(1000);

    return "";
  }

  public void getArrayValue(int[] array, int index) throws ArrayIndexOutOfBoundsException {
    System.out.println(array[index]);
  }

  public void getDbValue() {

    try(FileReader reader = new FileReader(new File(""))) {
      reader.read();

    } catch (IOException e) {

    }
  }
}
