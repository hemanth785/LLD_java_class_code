package A10_Vending_Machine;

import A10_Vending_Machine.Product_Rack_Inventory.Inventory;
import A10_Vending_Machine.Product_Rack_Inventory.Rack;
import A10_Vending_Machine.State_and_Implementations.NoMoneyInsertedState;
import A10_Vending_Machine.State_and_Implementations.State;

import java.util.List;


public class VendingMachine {
  private State currentState;
  private double insertedaAmount;
  private List<Rack> racks; 
  private List<Integer> availableRacks; 
  private Inventory inventory;

  // The VendingMachine is a Singleton class that ensures it will have only one active instance at a time
  private static VendingMachine vendingMachine = null;

  // Created a private constructor to add a restriction (due to Singleton)
  private VendingMachine(){
    this.currentState = new NoMoneyInsertedState(); //initial state
  }

  // Created a static method to access the singleton instance of VendingMachine
  public static VendingMachine getInstance() {
      if (vendingMachine == null) {
          vendingMachine = new VendingMachine();
      }
      return vendingMachine;
  }

  public void updateMachineState(State newState){
    this.currentState = newState;
  }

  public void insertMoney(double amount) {
    currentState.insertMoney(vendingMachine, amount);
  }
  public void pressDispenseButton(int rackNumber) {
    try {
      
      currentState.pressDispenseButton(vendingMachine, rackNumber);

    } catch (Exception e) {
      // TODO: handle exception
    }
    
  }
  public void returnChange(double amount) {
    currentState.returnChange(amount);
  }
  public void updateInventory(int rackNumber) {
    currentState.updateInventory(vendingMachine, rackNumber);
  }
  public void dispenseProduct(int rackNumber) {
    currentState.dispenseProduct(vendingMachine, rackNumber);
  }
  public int getProductIdAtRack(int rackNumber) {
    // TODO: logic to get productId

    return 1;
  }
}
