package ua.hillel.lession06.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Filming,Music {
  public void makeCall(String number) {
    enableGsmModule();
    System.out.println("Calling " + number);
  }

  public void receiveCall() {
    System.out.println("Incoming call");
  }

  abstract void sendSms(String text);

  private void enableGsmModule() {

  }

  public void getModel() {

  }
}
