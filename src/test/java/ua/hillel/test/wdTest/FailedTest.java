package ua.hillel.test.wdTest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FailedTest {
  @Test
  public void failedTest() {
    Assert.fail("FAILURE");
  }
}
