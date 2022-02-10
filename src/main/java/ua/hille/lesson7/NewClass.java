package ua.hille.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class NewClass {
  private String value;
  private int intVal;
  private boolean boolValue;

  public NewClass(String defaultValue) {
    value = defaultValue;
  }

  public NewClass() {
  }

  public NewClass(String value, int i, boolean b) {

  }

  public String getValue() {
    return value;
  }

  public NewClass setValue(String value) {
    this.value = value;
    return this;
  }

  public NewClass setIntVal(int intVal) {
    this.intVal = intVal;
    return this;
  }

  public NewClass setBoolValue(boolean boolValue) {
    this.boolValue = boolValue;
    return this;

  }

  public static void main(String[] args) {
    NewClass newClass = new NewClass();
    newClass.setValue("val").setBoolValue(true).setIntVal(10);
  }
}
