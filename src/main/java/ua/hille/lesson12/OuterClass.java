package ua.hille.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OuterClass {
  private String version = "1.2.3";

  public String getVersion() {
    return version;
  }

  public static class InnerClass {
    static String subVersion = "4.5.6";

    public static String getSubVersion() {
      return subVersion;
    }
  }
}
