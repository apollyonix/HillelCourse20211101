package ua.hille;

import java.util.Comparator;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    if ((o1 % 2 == 0) && (o2 % 2 != 0)) return 1;
    if ((o1 % 2 != 0) && (o2 % 2 == 0)) return -1;
    return o1.compareTo(o2);
  }
}
