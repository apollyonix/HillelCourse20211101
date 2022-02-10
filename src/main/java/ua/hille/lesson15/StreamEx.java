package ua.hille.lesson15;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StreamEx {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random random = new Random();
    for (int i=0; i<10000000; i++) {
      list.add(random.nextInt(100));
    }

    long start = System.currentTimeMillis();
    List<Integer> forList = new ArrayList<>();
    for (int el : list) {
      if (el % 2 == 0) {
        forList.add(el);
      }
    }
    long end = System.currentTimeMillis();
    System.out.println("Filtering list with FOR loop " + (end - start));

    start = System.currentTimeMillis();
    List<Integer> streamList = list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
    end = System.currentTimeMillis();
    System.out.println("Filtering list with STREAM loop " + (end - start));



  }
}
