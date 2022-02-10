package ua.hille.lesson7.pages;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SomePage extends AdminDetailPage {
  public SomePage() {
    System.out.println("some page");
  }

  public boolean hasValue() {
    return super.field != null;
  }

  public String getValue() {
    return getParentValue();
  }


  private String getParentValue() {
    return super.field;
  }
}
