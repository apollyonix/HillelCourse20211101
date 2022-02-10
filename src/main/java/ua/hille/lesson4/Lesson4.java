package ua.hille.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson4 {
  public static void main(String[] args) {
    for (int i=0; i<10; i++) {
      if (i==5) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println("after WHILE");
  }

  private static String getUser() {
    return "";
    //return random user from config
  }
}
