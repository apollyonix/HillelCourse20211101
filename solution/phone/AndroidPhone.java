package ua.hillel.lession06.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  public void sendSms(String text) {
    openMessage();
    System.out.println("Sending SMS with text: " + text);
  }

  public void makePhoto() {

  }

  public void makeVideo() {

  }

  public void playMusic() {

  }

  private void openMessage() {
    getModel();
    System.out.println("enable google message");
  }


}
