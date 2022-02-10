package ua.hille.lesson14;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CompareEx {
  public static void main(String[] args) {
//    Set<User> userSet = new TreeSet<>();
//    User user1 = new User("mike");
//    user1.setAge(18);
//
//    User user2 = new User("Mike");
//    user2.setAge(25);
//
//    User user3 = new User("Ann");
//    user3.setAge(20);
//
//    userSet.add(user1);
//    userSet.add(user2);
//    userSet.add(user3);
//
//    System.out.println(userSet);

    List<Integer> nums = new ArrayList<>(Arrays.asList(5,4,1,2,7,3,6));

    nums.sort(new MyComparator());

    System.out.println(nums);
  }
}
