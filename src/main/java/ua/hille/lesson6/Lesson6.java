package ua.hille.lesson6;

import ua.hille.lesson6.phone.AndroidPhone;
import ua.hille.lesson6.phone.IPhone;
import ua.hille.lesson6.phone.Phone;
import ua.hille.lesson6.phone.pages.User;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson6 {
  public static void main(String[] args) {
    int i = 4;
    int j = 6;

    User user1 = new User();
    user1.setUsername("jonSnow");


    User user2 = new User();
    user2.setUsername("jonSnow");

    System.out.println(user1);



  }
}
