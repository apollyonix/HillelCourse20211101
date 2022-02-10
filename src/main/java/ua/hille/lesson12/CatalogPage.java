package ua.hille.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogPage {
  public void setFilter(String filter) {
    System.out.println("Filter products by " + filter);
  }


  public class ProductTable {
    public void getProducts() {
      System.out.println("List of products");
    }
  }
}
