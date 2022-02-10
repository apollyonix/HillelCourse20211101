package ua.hille.lesson14;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WordCounter {
  public static void main(String[] args) {
    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae quam quam. Aenean dapibus vel nulla eleifend consectetur. Nulla rutrum ipsum justo, eget ullamcorper felis interdum in. Morbi nibh ex, iaculis sit amet efficitur ac, euismod gravida augue. Maecenas vulputate mattis ligula, eu vestibulum tellus scelerisque ac. Sed eget pharetra orci. Integer massa elit, hendrerit et maximus et, iaculis non augue. Aliquam erat volutpat. "
        + "Nulla auctor iaculis quam, in aliquet orci pulvinar vitae. Integer facilisis sem et augue malesuada sollicitudin. Aenean tristique augue facilisis quam rutrum, rutrum elementum libero bibendum. Aenean ultrices quam a urna dapibus, ut imperdiet sem interdum.";

    String[] words = input.split(" ");
    Map<String, Integer> wordMap = new HashMap<>();
    for (String word : words) {
      word = word.replace(",", "").replace(".", "").toLowerCase();
      if (wordMap.containsKey(word)) {
        wordMap.put(word, wordMap.get(word) + 1);
      } else {
        wordMap.put(word, 1);
      }
    }

    System.out.println(wordMap);
  }
}
