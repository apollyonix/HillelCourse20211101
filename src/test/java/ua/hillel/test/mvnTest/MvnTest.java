package ua.hillel.test.mvnTest;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Test
public class MvnTest {
  public void mbnTest() {
    System.out.println("I'm first mvn test");
    System.out.println("Open URL: " + System.getProperty("siteUrl"));
  }
}
