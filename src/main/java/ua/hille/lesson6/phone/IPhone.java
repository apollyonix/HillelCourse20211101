package ua.hille.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IPhone extends Phone {

  @Override
  @Deprecated
  public void makeOutgoingCall(String number) {
    System.out.println("Calling " + number + " from Iphone");
  }

  @Override
  public void receiveIncomingCall(String number) {
    System.out.println("New call from " + number + " on Iphone");
  }

  @Override
  public void makePhoto() {

  }

  @Override
  public void makeVideo() {
    startCamera();
    System.out.println("Make video on iphone");
  }

  @Override
  public void playMusic() {

  }

   void connectToICloud() {

  }

  private void startCamera() {
    System.out.println("starting ICamera");
  }
}
