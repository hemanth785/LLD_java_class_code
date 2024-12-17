package A10_Vending_Machine;

public class State_and_Implementations {

  // State is an interface

  public static interface State {
    // Interface method (does not have a body)
    public abstract void insertMoney(VendingMachine machine, double amount);
    public abstract void pressDispenseButton(VendingMachine machine, int rackNumber) throws Exception;
    public abstract void returnChange(double amount);
    public abstract void updateInventory(VendingMachine machine, int rackNumber);
    public abstract void dispenseProduct(VendingMachine machine, int rackNumber);
  }
  
  public static class NoMoneyInsertedState implements State  {
    
    public void insertMoney(VendingMachine machine, double amount) {
      // changes state to MonenInsertedState
      machine.updateMachineState(new MoneyInsertedState());
    }
    public void pressDispenseButton(VendingMachine machine, int rackNumber) throws Exception {
      throw new Exception("Please insert the money first");  //this is a invalid operation in this state
    }
    public void returnChange(double amount) {}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {}
  }
  
  public static class MoneyInsertedState implements State {
  
    public void insertMoney(VendingMachine machine, double amount) {}
    public void pressDispenseButton(VendingMachine machine, int rackNumber) {
        // check if product item is available
        // validate money and compare it with product price
        // change state to DispenseState 
    }
    public void returnChange(double amount) {}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {}
  }
  
  public static class DispenseState implements State {
  
    public void insertMoney(VendingMachine machine, double amount) {}
    public void pressDispenseButton(VendingMachine machine, int rackNumber) {}
    public void returnChange(double amount){}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {
        // dispense product
        // change state to NoMoneyInsertedState
    }
  }
  
}


