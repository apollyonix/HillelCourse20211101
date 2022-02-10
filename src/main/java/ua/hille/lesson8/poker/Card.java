package ua.hille.lesson8.poker;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Card {
  private static final Logger LOGGER = Logger.getLogger(Card.class.getName());

  private String suite;
  private String value;

  public Card(String suite, String value) {
    this.suite = suite;
    this.value = value;
  }

  public String getSuite() {
    return suite;
  }

  public String getValue() {
    return value;
  }

  public void setSuite(String suite) {
    LOGGER.log(Level.WARNING, "Setting suite " + suite);

    this.suite = suite;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value + " of " + this.suite;
  }
}
