package ua.hille.lesson5;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson5 {
  public static void main(String[] args) {
    int i = 0;

    do {
      i = getNewValue();
      System.out.println(i);
    } while ((i % 5) != 0);

    //    System.out.println(i);
  }

  public static int getNewValue() {
    return new Random().nextInt(100);
  }
}
