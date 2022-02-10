package ua.hille.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson12 {
  public static void main(String[] args) {
    CreateProductsTest.Product product = new CreateProductsTest.Product();


//    AbsClass absClass = new AbsClass() {
//      @Override
//      public String getSomeValue() {
//        return "abs";
//      }
//    };
//
//    absClass.getIntValue();
//    absClass.getSomeValue();


    Iface iface = new Iface() {
      @Override
      public long getLoooongValue() {
        return 11111L;
      }

      @Override
      public String getStrValue() {
        return "value";
      }
    };

    iface.getLoooongValue();
    iface.getStrValue();

    Iface iface1 = new IfaceImpl();
    iface1.getStrValue();
  }
}
