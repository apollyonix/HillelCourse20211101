package ua.hille.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileClass {
  public static void main(String[] args) {
    File file = new File("test.txt");


//    try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
//      String line;
//      while ((line = reader.readLine()) != null) {
//        System.out.println(line);
//      }
//
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }


//    try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
//      writer.write("new line in file");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    try {
//      Path path = Paths.get("test.txt").getFileName();

      List<String> lines = Files.readAllLines(file.toPath());

      Files.write(file.toPath(), lines, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
