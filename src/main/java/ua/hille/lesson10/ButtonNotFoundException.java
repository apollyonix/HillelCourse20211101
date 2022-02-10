package ua.hille.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ButtonNotFoundException extends RuntimeException {
  ButtonNotFoundException(String message) {
    super(message);
  }

  ButtonNotFoundException(String message, String html) {

  }
}
