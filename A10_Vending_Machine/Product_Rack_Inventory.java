package A10_Vending_Machine;

import java.util.List;

import A10_Vending_Machine.Enumerations.ProductType;

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
    private boolean empty;
    
    public boolean isEmpty(){
      return empty;
    }
  }

  
  public class Inventory {
    private List<Product> products;

    public void addProduct(int productId, int rackId){

    }
    public void removeProduct(int productId, int rackId){
      
    }
  }
}
