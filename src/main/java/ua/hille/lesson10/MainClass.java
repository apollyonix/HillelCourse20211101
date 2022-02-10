package ua.hille.lesson10;

import java.io.FileNotFoundException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainClass {
  public static void main(String[] args) {
//    new ConfigClass().getPropertyValue();

    int i = 0;

    try {
//      new ConfigClass().getPropertyValue();
      System.out.println("inside try");
      i = 10;
    } catch (Exception e) {
      System.out.println("inside CATCH");
    } finally {
      System.out.println("inside FINALLY");

    }


    if (true) {
      throw new ButtonNotFoundException("button Save not found");
    }

    if (false) {
//      throw new DropDownNotFound("Country Select not found");
    }

    System.out.println(i);
  }
}
