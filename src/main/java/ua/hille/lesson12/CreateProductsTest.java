package ua.hille.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CreateProductsTest {
  public static void main(String[] args) {
    Product product1 = new Product();
    product1.name = "prod1";
    product1.description = "prod1 desc";
    product1.price = 12.5;

    createProduct(product1);
  }

  private static void createProduct(Product product) {
    System.out.println("Name: " + product.name);
    System.out.println("Description: " + product.description);
    System.out.println("Price: " + product.price);
  }

  public static class Product {
    private String name;
    private String description;
    private double price;
  }
}
