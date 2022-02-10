package ua.hille.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AdminDetailPage extends UserDetailPage {
  public AdminDetailPage() {
//    super();
    System.out.println("Admin Detail Page");
  }


  protected String getAdminData() {
    System.out.println("Admin data");

    return "admin data";
  }
}
