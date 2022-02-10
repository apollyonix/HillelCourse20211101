package ua.hille.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyProperties {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileReader(new File("test2.properties")));

    System.out.println(properties.get("version"));
  }


}
