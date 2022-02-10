package ua.hille.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OverloadedMethods {
  public void registerUser(String username, String pass) {
    registerUser(username, pass, null);
  }

  public void registerUser(String username, String pass, String role) {
    if (role != null) {
      //some code for role
    }
    //common part
  }
}
