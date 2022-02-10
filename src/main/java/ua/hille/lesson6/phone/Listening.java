package ua.hille.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public interface Listening {
  void playMusic();


  default void playSound() {
    System.out.println("Bip");
  }
}
