package ua.hille.lesson8.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PokerGame {
  public static void main(String[] args) {
    PokerMachine pokerMachine = new PokerMachine();

    Card[] deck = pokerMachine.createDeck();
    pokerMachine.shuffleDeck(deck);
    pokerMachine.serveCards(deck, 5);
  }
}
