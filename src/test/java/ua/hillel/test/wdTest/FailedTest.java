package ua.hillel.test.wdTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FailedTest {
  @Test
  public void failedTest() {
    List<String> list = null;

    Assert.assertTrue(checkList(list, "test"));
  }

  private boolean checkList(List<String> list, String value) {
    return listContainsValue(list, value);
  }

  private boolean listContainsValue(List<String> list, String value) {
    return list.contains(value);
  }
}
