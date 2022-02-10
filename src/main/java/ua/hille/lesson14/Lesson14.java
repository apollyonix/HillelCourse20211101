package ua.hille.lesson14;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson14 {
  public static void main(String[] args) {
    User user = new User("mike");
    System.out.println(user.hashCode());
    Map<User, String> userMap = new HashMap<>();
    userMap.put(user, "value");

    user.setRole("admin");
    System.out.println(user.hashCode());

    System.out.println(userMap.get(user));

    System.out.println(userMap);
  }
}
