package Vending_Machine;

public class State_and_Implementations {

  // State is an interface
  
}

interface State {
  // Interface method (does not have a body)
  public abstract void insertMoney(VendingMachine machine, double amount);
  public abstract void pressButton(VendingMachine machine, int rackNumber);
  public abstract void returnChange(double amount);
  public abstract void updateInventory(VendingMachine machine, int rackNumber);
  public abstract void dispenseProduct(VendingMachine machine, int rackNumber);
}

class  NoMoneyInsertedState implements State {
  
  public void insertMoney(VendingMachine machine, double amount) {
    // changes state to MonenInsertedState
  }
  public void pressButton(VendingMachine machine, int rackNumber) {}
  public void returnChange(double amount) {}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {}
}

class MoneyInsertedState implements State {

  public void insertMoney(VendingMachine machine, double amount) {}
  public void pressButton(VendingMachine machine, int rackNumber) {
      // check if product item is available
      // validate money and compare it with product price
      // change state to DispenseState 
  }
  public void returnChange(double amount) {}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {}
}

class DispenseState implements State {

  public void insertMoney(VendingMachine machine, double amount) {}
  public void pressButton(VendingMachine machine, int rackNumber) {}
  public void returnChange(double amount){}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {
      // dispense product
      // change state to NoMoneyInsertedState
  }
}
