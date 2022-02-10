package ua.hille;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WordMap {
  public static void main(String[] args) {
    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse eu aliquam nisl, vitae pharetra augue. Maecenas id egestas purus, ut finibus turpis. Mauris mollis nisi sagittis risus venenatis maximus. Duis pulvinar tincidunt accumsan. In lorem leo, volutpat et nulla in, consectetur ultrices odio. Proin in quam a tortor iaculis suscipit non nec tellus. Etiam sodales vulputate orci ut suscipit. Proin eget blandit nisl. Fusce eros ante, viverra eu tellus eget, tincidunt posuere leo. "
        + "Donec rutrum, est vel vestibulum mollis, urna tortor tincidunt lorem, ut porta leo neque vel metus. Mauris vitae iaculis quam, sed aliquam lectus. Mauris luctus non tellus.";

    String[] words = input.split(" ");

    Map<String, Integer> wordCount = new HashMap<>();
    for (String word : words) {
      word = word.replace(",", "").replace(".", "").toLowerCase();
      if (wordCount.containsKey(word)) {
        wordCount.put(word, wordCount.get(word) + 1);
      } else {
        wordCount.put(word, 1);
      }
    }

    System.out.println(wordCount);
  }
}
