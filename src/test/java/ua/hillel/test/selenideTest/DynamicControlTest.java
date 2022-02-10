package ua.hillel.test.selenideTest;

import org.testng.annotations.Test;
import ua.hille.pageObjects.selenidePages.DynamicControlPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DynamicControlTest {
  @Test
  public void dynControlTest() {
    open("https://the-internet.herokuapp.com/dynamic_controls");

    DynamicControlPage controlPage = new DynamicControlPage();
    controlPage.setCheckBox();
    controlPage.addOrRemoveCheckbox(true);
    controlPage.addOrRemoveCheckbox(false);
    controlPage.setCheckBox();




    controlPage.enableOrDisableInput(true);
    controlPage.setInputText("selenide");
    controlPage.enableOrDisableInput(false);
  }
}
