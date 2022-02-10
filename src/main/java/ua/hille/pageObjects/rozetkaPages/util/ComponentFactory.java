package ua.hille.pageObjects.rozetkaPages.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ComponentFactory implements ElementLocatorFactory {
  private WebElement parent;

  public ComponentFactory(WebElement parent) {
    this.parent = parent;
  }

  @Override
  public ElementLocator createLocator(Field field) {
    return new DefaultElementLocator(parent, field);
  }
}
