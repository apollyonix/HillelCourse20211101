package ua.hillel.lession06.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IPhone extends Phone {
  @Override
  public void makePhoto() {

  }

  @Override
  public void makeVideo() {

  }

  @Override
  public void playMusic() {

  }

  @Override
  void sendSms(String text) {
    openMessage();
    System.out.println("Sending SMS with text: ");
  }

  private void openMessage() {
    System.out.println("enable iMessage");
  }
}
