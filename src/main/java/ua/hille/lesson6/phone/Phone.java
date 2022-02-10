package ua.hille.lesson6.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Listening, Filming{
  public abstract void makeOutgoingCall(String number);

  public abstract void receiveIncomingCall(String number);

  public void receiveSms(String number, String message) {
    System.out.println("Received message " + message + " from number" + number);
  }
}
