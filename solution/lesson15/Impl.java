package ua.hille.lesson15;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Impl {
  public static void main(String[] args) {
    Predicate<String> predicate = pred -> pred.contains("test");

    System.out.println(predicate.test("automation testing"));
    System.out.println(predicate.test("java automation"));

    Consumer<Integer> consumer = num -> System.out.println(num + 10);

    Supplier<Integer> supplier = () -> {
      Random random = new Random();
      int result = random.nextInt(100);
      return result;
    };

    System.out.println(supplier.get());

    Function<Integer, String> function = num -> String.format("app version %d", num);

    String s = function.apply(2);
    System.out.println(s);
  }
}
