package ua.hille.lesson8.poker;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PokerMachine {
  public Card[] createDeck() {
    String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    Card[] deck = new Card[52];

    int count = 0;
    for (String suite : suites) {
      for (String value : values) {
        deck[count++] = new Card(suite, value);
      }
    }

    return deck;
  }

  public void shuffleDeck(Card[] deck) {
    Random random = new Random();
    for (int i = 0; i<100; i++) {
      int in = random.nextInt(52);
      int out = random.nextInt(52);

      Card card = deck[in];
      deck[in] = deck[out];
      deck[out] = card;
    }
  }

  public void serveCards(Card[] deck, int noOfPlayers) {
    int count = 0;
    for (int round = 1; round <6; round++) {
      System.out.printf("%d round%n", round);
      for (int player = 1; player<=noOfPlayers; player++) {
        System.out.printf("Player %d gets %s%n", player, deck[count++]);
      }
      System.out.println("");
    }
  }
}
