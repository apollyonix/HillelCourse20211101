package ua.hille.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson7 {
  public void noReturnMethod() {

  }

  public int getSomeIntValue() {
    //some actions
    return 0;
  }


  public void methodWithParams(int param1, String param2, boolean param3) {
  }

  public void methodWithParams(int param) {
    System.out.println("Method 1");
  }

  public void methodWithParams(double param) {
    System.out.println("Method 2");
  }


  public void methodWithVarArgs(String s, String... products) {

  }

  public static void main(String[] args) {
//    new Lesson7().methodWithParams(10, "val", true);
//
//
//    new Lesson7().methodWithVarArgs("asd", "prod1", "prod2", "prod3");

    new Lesson7().methodWithParams(1.2);



  }


}
