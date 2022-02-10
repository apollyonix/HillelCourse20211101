package ua.hille.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3 {
  public static void main(String[] args) {
    System.out.println("Before IF");

    int day = 3;

    if (day == 1) {
      System.out.println("too hard");
    } else if (day == 3) {
      System.out.println("working hard");
    } else if (day == 5) {
      System.out.println("dayoff soon");
    }
    else {
      System.out.println("party hard");
    }

    switch (day) {
      case 1:
        System.out.println("too hard");
//        break;

      case 3:
        System.out.println("working hard");
//        break;

      case 5:
        System.out.println("dayoff soon");
        break;

      case 6:
        System.out.println("sat");
        break;

      default:
        System.out.println("party hard");
    }


    int holiday = day > 5 ? 1 : 0;

    boolean bool1 = day > 5 && checkFlag();
    boolean bool2 = bool1 || checkFlag2();
    boolean bool3 = bool2 && checkFlag3();

    if (bool3) {
      holiday = 1;
    } else {
      holiday = 0;
    }

    System.out.println("After IF");

  }


  public static boolean checkFlag() {
    return true;
  }

  public static boolean checkFlag2() {
    return true;
  }

  public static boolean checkFlag3() {
    return true;
  }
}
