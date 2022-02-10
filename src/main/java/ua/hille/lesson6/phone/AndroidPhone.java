package ua.hille.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  @Override
  public void makeOutgoingCall(String number) {
    System.out.println("Calling " + number + " from android");
  }

  @Override
  public void receiveIncomingCall(String number) {
    System.out.println("New call from " + number + " on android");
  }

  @Override
  public void playMusic() {

  }

  @Override
  public void playSound() {
    super.playSound();
  }

  @Override
  public void makePhoto() {

  }

  @Override
  public void makeVideo() {
    startCamera();
    System.out.println("Make video on android");
  }

  private void startCamera() {
    System.out.println("starting ICamera");
  }
}
