package ua.hille;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Sorting {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    Random random = new Random();

    for (int i=0; i<1000; i++) {
      nums.add(random.nextInt(1000));
    }

    long start = System.currentTimeMillis();
    sortNums(new ArrayList<>(nums));
    long end = System.currentTimeMillis();
    System.out.println(end - start);


    start = System.currentTimeMillis();
    sortNums(new LinkedList<>(nums));
    end = System.currentTimeMillis();
    System.out.println(end - start);


    start = System.currentTimeMillis();
    List<Integer> newNums = new LinkedList<>(nums);
    newNums.sort(Comparator.naturalOrder());
    end = System.currentTimeMillis();
    System.out.println(end - start);
  }

  private static List<Integer> sortNums(List<Integer> list) {
    boolean needSorting = true;
    while (needSorting) {
      needSorting = false;
      for (int i=0; i<list.size()-1; i++) {
        if (list.get(i) > list.get(i+1)) {
          int tmp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, tmp);
          needSorting = true;
        }
      }
    }

    return list;

  }

}
