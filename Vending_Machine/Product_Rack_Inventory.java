package Vending_Machine;

import java.util.List;

import Vending_Machine.Enumerations.ProductType;

public class Product_Rack_Inventory {
  public class Product {
    private String name;
    private int id;
    private double price;
    private ProductType type;
  }


  public class Rack {
    private int productId;
    private int rackNumber;
    
    public boolean isEmpty();
  }

  
  public class Inventory {
    private int noOfProducts;
    private List<Product> products;

    public void addProduct(int productId, int rackId);
    public void removeProduct(int productId, int rackId);
  }
}
