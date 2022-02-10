package ua.hille;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson14 {
  public static void main(String[] args) {
    //concurrent
    /*
    List<String> lines = new ArrayList<>(Arrays.asList("one", "", "two", "", "three"));

    for (String line : lines) {
      if (line.isEmpty()) {
        lines.remove(line);
      }
    }

    Iterator<String> iterator = lines.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().isEmpty()) {
        iterator.remove();
      }
    }

    System.out.println(lines);
    */

    //comaprator
    List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

    nums.sort(new MyComparator());

    System.out.println(nums);
  }
}
