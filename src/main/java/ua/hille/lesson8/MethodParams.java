package ua.hille.lesson8;

import ua.hille.lesson8.poker.Card;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodParams {
  public static void main(String[] args) {
    Card card = new Card("suite", "value");

    System.out.println(refMethod(card));
    System.out.println(card);



  }


  public static int valueMethod(int value) {
    value = value + 20;
    return value;
  }

  public static Card refMethod(Card card) {
    card.setValue("ace");
    card.setSuite("spade");

    return card;
  }
}
