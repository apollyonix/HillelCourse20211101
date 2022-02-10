package ua.hille.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogTest {
  public static void main(String[] args) {
    CatalogPage catalogPage = new CatalogPage();

    CatalogPage.ProductTable productTable1 = catalogPage.new ProductTable();
    productTable1.getProducts();

    catalogPage.setFilter("Price");

    CatalogPage.ProductTable productTable2 = catalogPage.new ProductTable();
    productTable2.getProducts();


  }
}
