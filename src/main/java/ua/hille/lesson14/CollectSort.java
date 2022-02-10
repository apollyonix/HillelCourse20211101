package ua.hille.lesson14;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CollectSort {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i<10; i++) {
      nums.add(random.nextInt(1000));
    }

    long start = System.currentTimeMillis();
    sortList(new ArrayList<>(nums));
    long end = System.currentTimeMillis();
    System.out.println("Sort array list: " + (end-start));


    start = System.currentTimeMillis();
    sortList(new LinkedList<>(nums));
    end = System.currentTimeMillis();
    System.out.println("Sort linked list: " + (end-start));

    start = System.currentTimeMillis();
    nums.sort(Comparator.naturalOrder());
    end = System.currentTimeMillis();
    System.out.println("Sort linked list: " + (end-start));

  }

  private static void sortList(List<Integer> list) {
    boolean needSort = true;
    while (needSort) {
      needSort = false;
      for (int i =0; i<list.size()-1; i++) {
        if (list.get(i) > list.get(i+1)) {
          int tmp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, tmp);
          needSort = true;
        }
      }
    }
  }
}
