package A18_Coupon_and_Promotions;

import java.util.ArrayList;
import java.util.List;

/*
 * Implement coupen code discount with multipe discount classes
 * 
 * Here we need to use "Decorator Design pattern" to implement this
 */
public static class Coupon_and_Promotion {
  enum Category {
    ELECTRONIC,
    FURNITURE,
    CLOTH
  }

  /*
   * Product class
   */
  abstract static class Product{
    String name;
    Category category;
    double originalPrice;

    Product(String name, Category category, double originalPrice){
      this.name = name;
      this.category = category;
      this.originalPrice = originalPrice;
    }

    abstract double getPrice();
  }


  static class Smartphone extends Product {
    Smartphone(String name, double originalPrice){
      super(name, Category.ELECTRONIC, originalPrice);
    }

    double getPrice(){
      return originalPrice;
    }
  }

  static class Sofa extends Product {
    Sofa(String name, double originalPrice){
      super(name, Category.FURNITURE, originalPrice);
    }

    double getPrice(){
      return originalPrice;
    }
  }

  /*
   * Discount decorators
   * 
   * Note: decorators also will be the product itself
   */

  abstract class DiscountDecorator extends Product {

  }

  // Decorator 1
  class PercentageDecorator extends DiscountDecorator {
    Product product;
    int discountPercentage;

    PercentageDecorator(Product product, int percentage){
      this.product = product;
      this.discountPercentage = percentage;
    }

    double getPrice(){
      double currentPrice = product.getPrice();
      return currentPrice - (currentPrice * discountPercentage)/100;
    }
  }

  // Decorator 2
  class TypeDecorator extends DiscountDecorator {
    Product product;
    int discountPercentage;
    Category eligibleCategory = Category.ELECTRONIC;

    TypeDecorator(Product product, int percentage){
      this.product = product;
      this.discountPercentage = percentage;
    }

    double getPrice(){
      double currentPrice = product.getPrice();
      //here we are applying discount on only eligible category products
      if(eligibleCategory.equals(product.category)){
        return currentPrice - (currentPrice * discountPercentage)/100;
      }
      return currentPrice;
    }
  }


  /*
   * Shopping cart
   */

  class ShoppingCart {
    List<Product> productList;
    
    ShoppingCart(){
      productList = new ArrayList<>();
    }

    public void addItem(Product product){
      //Here, we are automatically applying the elibible coupons
      Product typeDiscounted = new TypeDecorator(product, 5);
      Product percentageDiscounted = new PercentageDecorator(typeDiscounted, 10);

      productList.add(percentageDiscounted);
    }

    //here it returns total amount after the discount price
    public double getTotal(){
      double totalPrice = 0.0;
      for(Product product: productList){
        totalPrice += product.getPrice();
      }

      return totalPrice;
    }
  }


  /*
   * Client code
   */

  public static void main(String[] args) {
    Product smartphone = new Smartphone("Samsung S23", 40000);
    Product sofaSet = new Sofa("Teakwood", 15000);
    
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(smartphone);
    cart.addItem(sofaSet);

    System.out.println("Total cart price after discount: "+ cart.getTotal());
  }
}
