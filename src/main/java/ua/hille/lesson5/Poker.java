package ua.hille.lesson5;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Poker {
  public static void main(String[] args) {
    int noOfCards = 52;
    int noOfPlayers = 4;

    String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    String[] deck = new String[noOfCards];

    int count = 0;
    for (String suite : suites) {
      for (String value : values) {
        deck[count++] = value + " of " + suite;
      }
    }

    Random random = new Random();
    for (int i = 0; i<100; i++) {
      int in = random.nextInt(noOfCards);
      int out = random.nextInt(noOfCards);

      String card = deck[in];
      deck[in] = deck[out];
      deck[out] = card;
    }

    count = 0;
    for (int round = 1; round <6; round++) {
      System.out.printf("%d round%n", round);
      for (int player = 1; player<=noOfPlayers; player++) {
        System.out.printf("Player %d gets %s%n", player, deck[count++]);
      }
      System.out.println("");
    }


    String s = String.format("%d %f %s",
                             10,
                             12.5,
                             "str");

    String s1 = 10 + " " + 12.5 + " " + "str";
  }
}
