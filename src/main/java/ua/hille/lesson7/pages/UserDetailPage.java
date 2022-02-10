package ua.hille.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserDetailPage {
  protected String field;

  public UserDetailPage() {
    field = "value";
    System.out.println("User Detail page");
  }

//  public UserDetailPage(String value) {
//    System.out.println("User Detail page" + " " + value);
//  }

  public String getUserData() {
    System.out.println("User data");
    return "user data";
  }
}
