package ua.hille.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */


public class FinalClass {
  public static String NEW = "New";
  public static String IN_PROGRESS = "In Progress";


  public static void setStatus(Status status) {
    System.out.println(status.getStatus());
  }

  public static void setStatus(String status) {
    System.out.println(status);
  }

  public static void notFinalMethod() {
  }

  public void nonStaticMethod() {

  }
}